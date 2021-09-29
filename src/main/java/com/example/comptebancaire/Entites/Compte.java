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
public class Compte {
    private @Id
    @GeneratedValue
    long id;
    int num;
    String adress;
    String detail;

    public Compte(int num, String adress, String detail) {
    }
}
