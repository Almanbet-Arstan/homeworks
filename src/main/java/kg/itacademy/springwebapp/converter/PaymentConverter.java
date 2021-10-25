package kg.itacademy.springwebapp.converter;

import kg.itacademy.springwebapp.entity.Client;
import kg.itacademy.springwebapp.entity.Payment;
import kg.itacademy.springwebapp.model.PaymentModel;

import java.util.function.Function;

public class PaymentConverter extends BaseConverter<PaymentModel, Payment>{

    public PaymentConverter() {
        super(PaymentConverter::convertToEntity, PaymentConverter::convertToModel);
    }
    private static PaymentModel convertToModel(Payment entityToConvert){
        if (entityToConvert == null) return null;
        return PaymentModel.builder()
                .clientId(entityToConvert.getClient().getId())
                .amount(entityToConvert.getAmount())
                .status(entityToConvert.getStatus())
                .createDate(entityToConvert.getCreateDate())
                .build();
    }

    private static Payment convertToEntity(PaymentModel modelToConvert){
        if (modelToConvert == null) return null;

        Payment paymentToReturn = new Payment();

        paymentToReturn.setStatus(modelToConvert.getStatus());
        paymentToReturn.setAmount(modelToConvert.getAmount());
        Client client = new Client();
        client.setId(modelToConvert.getClientId());
        paymentToReturn.setClient(client);

        return paymentToReturn;
    }

}
