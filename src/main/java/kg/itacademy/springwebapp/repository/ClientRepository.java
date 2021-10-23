package kg.itacademy.springwebapp.repository;

import kg.itacademy.springwebapp.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
