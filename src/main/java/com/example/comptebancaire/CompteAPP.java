package com.example.comptebancaire;
import com.example.comptebancaire.Dao.ClientRepository;
import com.example.comptebancaire.Dao.CompteRepository;
import com.example.comptebancaire.Dao.OperationRepository;
import com.example.comptebancaire.Entites.Client;
import com.example.comptebancaire.Entites.Compte;
import com.example.comptebancaire.Entites.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


@SpringBootApplication
public class CompteAPP  {
    public static void main(String[] args) {
        SpringApplication.run(CompteAPP.class, args);

    }
    @Bean
    CommandLineRunner initDatabase(ClientRepository clientRepository) {

        return args -> {
            clientRepository.save(new Client("Bij","Kashama", 508765444 , 50 , "24 rue jean money 75015" , 766543 ));
            clientRepository.save(new Client("lola","Fatima", 508885444 , 20 , "84 rue jean money 91015" , 763333 ));
            clientRepository.save(new Client("Moussa","Bernard", 508767744 , 60 , "874 rue Claude 95005" , 762223 ));
        };
    }


    CommandLineRunner initDatabase(OperationRepository operationRepository) {

        return args -> {
            operationRepository.save(new Operation(12071997, "Operation du jour"));
            operationRepository.save(new Operation(16082020, "Operation d'hier"));
            operationRepository.save(new Operation(29092021, "Operation à venir"));
        };
    }


    CommandLineRunner initDatabase(CompteRepository compteRepository) {

        return args -> {
            compteRepository.save(new Compte(25555, "54 rue François 78022", "Compte courant"));
            compteRepository.save(new Compte(77777, "65 rue bourgii 91065", "Compte commun"));
            compteRepository.save(new Compte(88888, "90 rue liberte 946789", "Compte mineur"));
        };
    }
}

