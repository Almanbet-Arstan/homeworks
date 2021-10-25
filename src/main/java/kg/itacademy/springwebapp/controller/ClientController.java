package kg.itacademy.springwebapp.controller;

import kg.itacademy.springwebapp.entity.Client;
import kg.itacademy.springwebapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable Long id){
        return clientService.getById(id);
    }

    @GetMapping("/status/{statusId}")
    public List<Client> getByStatus(@PathVariable Long statusId){
        return clientService.findByStatus(statusId);
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public Client deleteById(@PathVariable Long id){
        return clientService.deleteById(id);
    }
}
