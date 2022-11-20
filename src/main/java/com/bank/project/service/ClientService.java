package com.bank.project.service;

import com.bank.project.model.Client;

public interface ClientService {

    Iterable<Client> searchAll();

    Client searchById(Long clientId);

    void insert(Client client);

    void update(Long clientId, Client client);

    void delete(Long clientId);

}
