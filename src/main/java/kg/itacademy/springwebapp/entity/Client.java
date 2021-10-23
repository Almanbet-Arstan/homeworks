package kg.itacademy.springwebapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client extends BaseEntity{

    @Column(name = "full_name")
    private String fullName;
    @Column(name = "status")
    private Long status;
}
