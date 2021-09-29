package com.example.comptebancaire.Service;

import com.example.comptebancaire.Dao.CompteRepository;
import com.example.comptebancaire.Entites.Compte;
import com.example.comptebancaire.Exception.CompteNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompteService {
    @Autowired
    private CompteRepository compteRepository;
    public List<Compte> getcompte(){
        return  compteRepository.findAll();
    }
    public Compte getCompte(Long id){

        return compteRepository.findById(id)
                .orElseThrow(() -> new CompteNotFoundException(id));
    }

    public Compte createCompte(Compte compte){
        return compteRepository.save(compte);
    }

    public void deleteCompte(long id){
        compteRepository.deleteById(id);
    }
}
