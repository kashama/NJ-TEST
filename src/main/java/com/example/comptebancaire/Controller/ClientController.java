package com.example.comptebancaire.Controller;

import com.example.comptebancaire.Entites.Client;
import com.example.comptebancaire.Service.ClientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ClientController {
    private final ClientService clientService;
    ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value="/clients")
    List<Client> all() {
        return clientService.getClients();
    }

    @GetMapping(value="/clients/{id}")
    Client getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @PostMapping(value="/clients")
    Client newClient(@RequestBody Client newClient) {
        return clientService.createClient(newClient);
    }

    @DeleteMapping(value="/clients/{id}")
    void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}