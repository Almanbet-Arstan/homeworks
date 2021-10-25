package kg.itacademy.springwebapp.converter;

import kg.itacademy.springwebapp.entity.Client;
import kg.itacademy.springwebapp.model.ClientModel;


public class ClientConverter extends BaseConverter<ClientModel, Client> {
    public ClientConverter() {
        super(ClientConverter::convertToEntity, ClientConverter::convertToModel);
    }

    private static Client convertToEntity(ClientModel clientModel) {
        throw new UnsupportedOperationException("Conversation from ClientModel to Client is not supported");
    }

    private static ClientModel convertToModel(Client entityToConvert) {
        if (entityToConvert == null) return null;
        return ClientModel.builder()
                .fullName(entityToConvert.getFullName())
                .status(entityToConvert.getStatus())
                .build();
    }
}
