package com.example.comptebancaire.Entites;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
@Setter

public class Client {
    private @Id
    @GeneratedValue
    long id;
    private String nom;
    private String prenom;
    private int numTelephone;
    private int age;
    private String adress;
    private int numIdentBanque;

    public Client(String nom, String  prenom, int numTelephone, int age, String adress, int numIdentBanque) {
    }
}
