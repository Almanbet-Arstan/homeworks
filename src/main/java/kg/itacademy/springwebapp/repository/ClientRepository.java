package kg.itacademy.springwebapp.repository;

import kg.itacademy.springwebapp.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByFullName(String fullName);
    List<Client> findAllByStatus(Long status);
}
