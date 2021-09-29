package com.example.comptebancaire.Controller;

import com.example.comptebancaire.Dao.OperationRepository;
import com.example.comptebancaire.Entites.Operation;
import com.example.comptebancaire.Exception.OperationNotFoundException;
import org.hibernate.cfg.beanvalidation.GroupsPerOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OperationController {
    private final OperationRepository repository;

    OperationController(OperationRepository repository) {
    this.repository = repository;
    }
    @GetMapping("/operations")
    List<Operation> all() {
        return repository.findAll();
    }
    @GetMapping("/operations/{id}")
    Operation one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new OperationNotFoundException(id));
    }

    @PostMapping("/operations")
    Operation newOperation (@RequestBody Operation newOperation) {
        return repository.save(newOperation);
    }
    @DeleteMapping("/operations/{id}")
    void deleteOperation(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

