package kg.itacademy.springwebapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentModel {
    private Long clientId;
    private BigDecimal amount;
    private Long status;
    private LocalDateTime createDate;
}
