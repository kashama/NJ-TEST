package com.example.comptebancaire.Dao;

import com.example.comptebancaire.Entites.Client;
import com.example.comptebancaire.Entites.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface CompteRepository extends JpaRepository<Compte, Long> {

    public Map<String,String> aficherRelever(String adress, String detail, int num);


}
