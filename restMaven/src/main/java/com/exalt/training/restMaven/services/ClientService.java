package com.exalt.training.restMaven.services;

import com.exalt.training.restMaven.Models.Client;
import com.exalt.training.restMaven.Repo.ClientRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

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

    public void addClient(Client client) {
        clientRepo.save(client);
    }

    public void deleteClient(Long id) {
        clientRepo.deleteById(id);
    }

    public Client partialUpdate(Long id, Client client) {

        return clientRepo.findById(id).map(existingClient -> {
            Optional.ofNullable(client.getBalance()).ifPresent(existingClient::setBalance);

            return clientRepo.save(existingClient);

        }).orElseThrow(()-> new RuntimeException("Client not found with id " + client.getId()));
    }
}
