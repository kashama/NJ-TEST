package com.example.comptebancaire.Service;

import com.example.comptebancaire.Dao.OperationRepository;
import com.example.comptebancaire.Entites.Operation;
import com.example.comptebancaire.Exception.OperationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OperationService {
    @Autowired
    private OperationRepository operationRepository;
    public List<Operation> getoperation(){
        return  operationRepository.findAll();
    }
    public Operation getoperation(Long id){

        return operationRepository.findById(id)
                .orElseThrow(() -> new OperationNotFoundException(id));
    }

    public Operation createOperation(Operation operation){
        return operationRepository.save(operation);
    }

    public void deleteOperation(long id){
        operationRepository.deleteById(id);
    }
}

