package kg.itacademy.springwebapp.service;

import kg.itacademy.springwebapp.entity.Client;
import kg.itacademy.springwebapp.model.ClientModel;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    List<ClientModel> getAllModel();
    Client getById(Long id);
    Client saveClient(Client client);
    Client deleteById(Long id);
    List<Client> findByStatus(Long id);
    Client updateClient(Client client);
}
