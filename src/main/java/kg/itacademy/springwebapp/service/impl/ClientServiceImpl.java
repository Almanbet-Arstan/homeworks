package kg.itacademy.springwebapp.service.impl;

import kg.itacademy.springwebapp.converter.ClientConverter;
import kg.itacademy.springwebapp.entity.Client;
import kg.itacademy.springwebapp.model.ClientModel;
import kg.itacademy.springwebapp.repository.ClientRepository;
import kg.itacademy.springwebapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public List<ClientModel> getAllModel() {
        ClientConverter clientConverter = new ClientConverter();
        return clientRepository.findAll().stream().map(clientConverter::convertFromEntity).collect(Collectors.toList());
    }

    @Override
    public Client getById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client deleteById(Long id) {
        Client clientForDelete = getById(id);
        if (clientForDelete != null) clientRepository.delete(clientForDelete);

        return clientForDelete;
    }

    @Override
    public List<Client> findByStatus(Long id) {
        return clientRepository.findAllByStatus(id);
    }

    @Override
    public Client updateClient(Client client) {
        Client clientForUpdate = getById(client.getId());

        if (client.getCreateDate() != null) clientForUpdate.setCreateDate(client.getCreateDate());
        if (client.getFullName() != null) clientForUpdate.setFullName(client.getFullName());
        if (client.getStatus() != null) clientForUpdate.setStatus(client.getStatus());

        return clientRepository.save(clientForUpdate);
    }
}
