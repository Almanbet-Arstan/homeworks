package kg.itacademy.springwebapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "payment")
@Getter
@Setter
public class Payment extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private BigDecimal amount;

    private Long status;
}
