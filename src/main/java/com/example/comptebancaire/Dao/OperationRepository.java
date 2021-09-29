package com.example.comptebancaire.Dao;

import com.example.comptebancaire.Entites.Compte;
import com.example.comptebancaire.Entites.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  OperationRepository extends JpaRepository<Operation, Long> {

    public  void deposer();
    public  void retirer( );

}
