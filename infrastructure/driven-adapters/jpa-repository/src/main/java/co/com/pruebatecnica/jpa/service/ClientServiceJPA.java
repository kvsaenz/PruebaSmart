package co.com.pruebatecnica.jpa.service;

import co.com.pruebatecnica.jpa.help.ClientFactory;
import co.com.pruebatecnica.jpa.repository.JPAClientRepository;
import co.com.pruebatecnica.model.client.Client;
import co.com.pruebatecnica.model.client.gateways.ClientRepository;
import co.com.pruebatecnica.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ClientServiceJPA implements ClientRepository {

    @Autowired
    JPAClientRepository jpaClientRepository;

    ClientFactory clientFactory = new ClientFactory();

    @Override
    public boolean saveClient(Client data) {
        try {
            jpaClientRepository.save(clientFactory.clientToData(data));
            return true;
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
            return false;
        }
    }

    @Override
    public Client retrieveClient(int idCliente) {
        return new ClientFactory().dataToClient(jpaClientRepository.findById(idCliente).get());
    }

    @Override
    public List<Client> retrieveClients() {
        List<Client> result = new ArrayList<>();
        jpaClientRepository.findAll().forEach( r ->{
                    result.add(clientFactory.dataToClient(r));
                }
        );
        return result;
    }
}
