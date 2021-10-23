package kg.itacademy.springwebapp.service;

import kg.itacademy.springwebapp.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client getById(Long id);
    Client saveClient(Client client);
    Client deleteById(Long id);
}
