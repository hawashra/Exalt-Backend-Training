package com.exalt.training.restMaven.services;

import com.exalt.training.restMaven.Models.Client;
import com.exalt.training.restMaven.Repo.ClientRepo;
import com.exalt.training.restMaven.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private final ClientRepo clientRepo;

    public ClientService( ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public Optional<Client> getClientById(Long id) {
        return clientRepo.findById(id);
    }

    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    public Client updateClient(Long id, Client clientInfo) {
        Client client = clientRepo.findById(id).get();
        client.setId(clientInfo.getId());
        client.setFirstName(clientInfo.getFirstName());
        client.setLastName(clientInfo.getLastName());
        client.setBalance(clientInfo.getBalance());
        clientRepo.save(client);

        return client;
    }

}
