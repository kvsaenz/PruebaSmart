package co.com.pruebatecnica.jpa.help;

import co.com.pruebatecnica.jpa.modelJPA.ClientData;
import co.com.pruebatecnica.model.client.Client;

public class ClientFactory {

    public ClientData clientToData(Client client) {
        return new ClientData().builder()
                .id_cliente(client.getId_cliente())
                .apellido(client.getApellido())
                .nombre(client.getNombre())
                .direccion(client.getDireccion())
                .email(client.getEmail())
                .fecha_nacimiento(client.getFecha_nacimiento())
                .telefono(client.getTelefono())
                .build();
    }

    public Client dataToClient(ClientData client) {
        return new Client().builder()
                .id_cliente(client.getId_cliente())
                .apellido(client.getApellido())
                .nombre(client.getNombre())
                .direccion(client.getDireccion())
                .email(client.getEmail())
                .fecha_nacimiento(client.getFecha_nacimiento())
                .telefono(client.getTelefono())
                .build();
    }
}
