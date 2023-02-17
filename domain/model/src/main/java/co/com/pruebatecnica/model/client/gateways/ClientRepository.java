package co.com.pruebatecnica.model.client.gateways;

import co.com.pruebatecnica.model.client.Client;

import java.util.List;

public interface ClientRepository {

    /**
     * Function for save data client in DataBase
     * @param data Data for save in DB
     * @return boolean result process
     */
    boolean saveClient(Client data);

    /**
     * Function for retrieve data Client for Database
     * @param idCliente Param for find in database client
     * @return Data of Client find
     */
    Client retrieveClient(int idCliente);

    List<Client> retrieveClients();
}
