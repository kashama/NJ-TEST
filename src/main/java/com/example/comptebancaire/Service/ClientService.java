package com.example.comptebancaire.Service;

import com.example.comptebancaire.Dao.ClientRepository;
import com.example.comptebancaire.Entites.Client;
import com.example.comptebancaire.Exception.ClientNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client>getClients(){
        return  clientRepository.findAll();
    }
    public Client getClient(Long id){

        return clientRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException(id));
    }

    public Client createClient(Client client){
        return clientRepository.save(client);
    }

    public void deleteClient(long id){
        clientRepository.deleteById(id);
    }
}