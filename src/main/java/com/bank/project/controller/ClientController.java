package com.bank.project.controller;

import com.bank.project.model.Client;
import com.bank.project.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> searchAll(){
        return ResponseEntity.ok(clientService.searchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> searchById(@PathVariable Long clientId){
        return ResponseEntity.ok(clientService.searchById(clientId));
    }

    @PostMapping
    public ResponseEntity<Client> insert(Client client){
        clientService.insert(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long clientId, Client client){
        clientService.update(clientId, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Client> delete(Long clientId){
        clientService.delete(clientId);
        return ResponseEntity.ok().build();
    }

}
