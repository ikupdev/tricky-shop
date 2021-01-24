package ru.kuper.trickyshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuper.trickyshop.model.Client;
import ru.kuper.trickyshop.repository.ClientRepository;

import java.util.*;

@Service
public class ClientService implements IClientService {

    @Autowired
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void create(Client client) {
        clientRepository.save(client);
    }

    @Override
    public List<Client> readAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client read(int id) {
        Optional<Client> client = clientRepository.findById((long) id);
        return client.isPresent() ? client.get() : null;
    }

    @Override
    public boolean update(Client client, int id) {

        Optional<Client> finded = clientRepository.findById((long) id);
        if (finded.isPresent()) {
            Client client1 = finded.get();
            client1.setName(client.getName());
            client1.setEmail(client.getEmail());
            client1.setPhone(client.getPhone());
            clientRepository.save(client1);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Optional<Client> byId = clientRepository.findById((long) id);
        if (byId.isPresent()) {
            clientRepository.deleteById((long) id);
            return true;
        }
        return false;
    }

}
