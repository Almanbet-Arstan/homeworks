package kg.itacademy.springwebapp.service.impl;

import kg.itacademy.springwebapp.converter.PaymentConverter;
import kg.itacademy.springwebapp.entity.Payment;
import kg.itacademy.springwebapp.model.PaymentModel;
import kg.itacademy.springwebapp.repository.PaymentRepository;
import kg.itacademy.springwebapp.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PaymentConverter paymentConverter;

    @Override
    public Payment create(PaymentModel paymentModel) {
        return paymentRepository.save(paymentConverter.convertFromModel(paymentModel));
    }
}
