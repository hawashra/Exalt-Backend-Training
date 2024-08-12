package com.exalt.training.restMaven.Controller;

import com.exalt.training.restMaven.Models.Client;
import com.exalt.training.restMaven.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(final ClientService clientService) {
        this.clientService = clientService;
    }

    //clients
    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    //clients/{id}

    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id).orElseThrow();
    }

    //clients
    @PostMapping("/clients")
    public String addClient(@RequestBody Client client) {
        clientService.addClient(client);
        return "Client created successfully";
    }

    //clients/{id}
    @DeleteMapping("/clients/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "Client deleted successfully";
    }

    //clients/{id}
    @PutMapping("/clients/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        return clientService.updateClient(id, client);
    }


    // partial update for the client to change balance.
    @PatchMapping("/clients/{id}")
    public ResponseEntity<Client> updateClientBalance(@PathVariable Long id, @RequestBody Client client) {
        if (!clientService.getClientById(id).isPresent()) {
            throw new RuntimeException("Client not found with id " + id);
        }

        Client updatedClient = clientService.partialUpdate(id, client);

        return new ResponseEntity<>(updatedClient, HttpStatus.OK);
    }
}
