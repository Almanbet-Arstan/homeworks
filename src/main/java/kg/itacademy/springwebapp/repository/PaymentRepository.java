package kg.itacademy.springwebapp.repository;

import kg.itacademy.springwebapp.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findAllByStatusAndCreateDateBetween(Long statusId, LocalDateTime dateFrom, LocalDateTime dateTo);
}
