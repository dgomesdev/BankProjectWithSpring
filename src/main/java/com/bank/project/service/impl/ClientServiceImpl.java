package com.bank.project.service.impl;

import com.bank.project.model.Client;
import com.bank.project.repository.AccountRepository;
import com.bank.project.repository.ClientRepository;
import com.bank.project.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Iterable<Client> searchAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client searchById(Long clientId) {
        Optional<Client> client = clientRepository.findById(clientId);
        return client.orElse(null);
    }

    @Override
    public void insert(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void update(Long clientId, Client client) {
        Optional<Client> clientUpdate = clientRepository.findById(clientId);
        if(clientUpdate.isPresent()) clientRepository.save(client);
    }

    @Override
    public void delete(Long clientId) {
        clientRepository.deleteById(clientId);
    }
}
