package com.exalt.training.restMaven.Controller;

import com.exalt.training.restMaven.Models.Client;
import com.exalt.training.restMaven.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

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
}
