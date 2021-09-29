package com.example.comptebancaire.Main;
import com.example.comptebancaire.Dao.ClientRepository;
import com.example.comptebancaire.Dao.CompteRepository;
import com.example.comptebancaire.Dao.OperationRepository;
import com.example.comptebancaire.Entites.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
public class CompteAPP implements CommandLineRunner{
    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(CompteAPP.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

    }


}
