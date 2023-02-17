package co.com.pruebatecnica.usecase.retrieve;

import co.com.pruebatecnica.model.bill.Bill;
import co.com.pruebatecnica.model.bill.gateways.BillRepository;
import co.com.pruebatecnica.model.client.Client;
import co.com.pruebatecnica.model.client.gateways.ClientRepository;
import co.com.pruebatecnica.model.detail.Detail;
import co.com.pruebatecnica.model.detail.gateways.DetailRepository;
import co.com.pruebatecnica.model.product.Product;
import co.com.pruebatecnica.model.product.gateways.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RetrieveUseCase {

    private final ClientRepository clientRepository;

    private final ProductRepository productRepository;

    private final BillRepository billRepository;

    private final DetailRepository detailRepository;

    public Client retrieveClient(int idCliente) {
        return clientRepository.retrieveClient(idCliente);
    }

    public List<Client> retrieveClients() {
        return clientRepository.retrieveClients();
    }

    public List<Product> retrieveProducts() {
        return productRepository.retrieveProducts();
    }

    public Product retrieveProduct(int idProducto) {
        return productRepository.retrieveProduct(idProducto);
    }

    public List<Bill> retrieveBill(int idCliente) {
        return billRepository.retrieveBill(idCliente);
    }

    public List<Detail> retrieveDetails(Long numFactura) {
        return detailRepository.retrieveDetails(numFactura);
    }


}
