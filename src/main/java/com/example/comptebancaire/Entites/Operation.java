package com.example.comptebancaire.Entites;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Operation {
    private @Id
    @GeneratedValue
    long id;
    Date date;
    String detail;

}
