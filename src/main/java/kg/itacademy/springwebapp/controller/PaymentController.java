package kg.itacademy.springwebapp.controller;

import kg.itacademy.springwebapp.entity.Payment;
import kg.itacademy.springwebapp.model.PaymentModel;
import kg.itacademy.springwebapp.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;


    @PostMapping
    public Payment create(@RequestBody PaymentModel paymentModel) {
        return paymentService.create(paymentModel);
    }
}
