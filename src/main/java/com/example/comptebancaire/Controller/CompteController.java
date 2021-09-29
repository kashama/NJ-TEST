package com.example.comptebancaire.Controller;

import com.example.comptebancaire.Dao.CompteRepository;
import com.example.comptebancaire.Entites.Compte;
import com.example.comptebancaire.Exception.CompteNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    public class CompteController {
        private final CompteRepository repository;

        CompteController(CompteRepository repository) {
            this.repository = repository;
        }

        @GetMapping("/comptes")
        List<Compte> all() {
            return repository.findAll();
        }

        @GetMapping("/comptes/{id}")
        Compte one(@PathVariable Long id) {

            return repository.findById(id)
                    .orElseThrow(() -> new CompteNotFoundException(id));
        }

        @PostMapping("/comptes")
        Compte newCompte(@RequestBody Compte newCompte) {
            return repository.save(newCompte);
        }

        @DeleteMapping("/comptes/{id}")
        void deleteOperation(@PathVariable Long id) {
            repository.deleteById(id);
        }
    }
