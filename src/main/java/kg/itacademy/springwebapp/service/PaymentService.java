package kg.itacademy.springwebapp.service;

import kg.itacademy.springwebapp.entity.Payment;
import kg.itacademy.springwebapp.model.PaymentModel;

public interface PaymentService {
    Payment create(PaymentModel paymentModel);
}
