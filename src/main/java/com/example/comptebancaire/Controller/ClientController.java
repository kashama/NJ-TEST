package com.example.comptebancaire.Controller;

import com.example.comptebancaire.Dao.ClientRepository;
import com.example.comptebancaire.Entites.Client;
import com.example.comptebancaire.Exception.ClientNotFoundException;
import com.example.comptebancaire.Service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ClientController {
    private final ClientService clientService;
    ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    List<Client> all() {
        return clientService.getClients();
    }

    @GetMapping("/clients/{id}")
    Client getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @PostMapping("/clients")
    Client newClient(@RequestBody Client newClient) {
        return clientService.createClient(newClient);
    }

    @DeleteMapping("/clients/{id}")
    void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}