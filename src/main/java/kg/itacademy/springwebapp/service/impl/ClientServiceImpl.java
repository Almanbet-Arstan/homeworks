package kg.itacademy.springwebapp.service.impl;

import kg.itacademy.springwebapp.entity.Client;
import kg.itacademy.springwebapp.repository.ClientRepository;
import kg.itacademy.springwebapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
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
}
