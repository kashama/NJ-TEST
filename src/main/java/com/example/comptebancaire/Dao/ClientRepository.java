package com.example.comptebancaire.Dao;


import com.example.comptebancaire.Entites.Client;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Configuration
@Repository

public interface  ClientRepository extends JpaRepository<Client, Long> {
    public Map<String,String> aficherinfo(String adress, String detail, int num);

}
