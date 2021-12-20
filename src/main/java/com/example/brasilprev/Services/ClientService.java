package com.example.brasilprev.Services;

import com.example.brasilprev.Model.Client;
import com.example.brasilprev.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientService {

    @Autowired
    private ClientRepository clienteRepository;

    public List<Client> findAll() {
        return clienteRepository.findAll();

    }

    public Optional<Client> findById(Integer id) {
        return clienteRepository.findById(id);

    }

    public Client add(Client client) {
        return clienteRepository.save(client);

    }

    public void delete(Integer id) {
        clienteRepository.findById(id);

    }

    public Client update(Integer id, Client client) {
        client.setId(id);
        return clienteRepository.save(client);

    }
}
