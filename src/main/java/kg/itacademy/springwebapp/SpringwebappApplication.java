package kg.itacademy.springwebapp;

import kg.itacademy.springwebapp.converter.PaymentConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);
	}

	@Bean
	public PaymentConverter paymentConverter() {
		return new PaymentConverter();
	}
}
