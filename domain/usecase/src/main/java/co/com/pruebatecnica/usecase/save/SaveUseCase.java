package co.com.pruebatecnica.usecase.save;

import co.com.pruebatecnica.model.bill.Bill;
import co.com.pruebatecnica.model.bill.gateways.BillRepository;
import co.com.pruebatecnica.model.client.Client;
import co.com.pruebatecnica.model.client.gateways.ClientRepository;
import co.com.pruebatecnica.model.detail.Detail;
import co.com.pruebatecnica.model.detail.gateways.DetailRepository;
import co.com.pruebatecnica.model.product.Product;
import co.com.pruebatecnica.model.product.gateways.ProductRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SaveUseCase {

    private final ClientRepository clientRepository;

    private final ProductRepository productRepository;

    private final BillRepository billRepository;

    private final DetailRepository detailRepository;

    public boolean saveClient(Client client){
        return clientRepository.saveClient(client);
    }

    public boolean saveProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    public boolean saveBill(Bill bill) {
        return billRepository.saveBill(bill);
    }

    public boolean saveDetail(Detail detail) {
        return detailRepository.saveDetail(detail);
    }
}
