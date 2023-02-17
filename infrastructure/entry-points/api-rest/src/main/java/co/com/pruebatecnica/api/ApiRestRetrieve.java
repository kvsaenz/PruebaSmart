package co.com.pruebatecnica.api;

import co.com.pruebatecnica.model.bill.Bill;
import co.com.pruebatecnica.model.client.Client;
import co.com.pruebatecnica.model.detail.Detail;
import co.com.pruebatecnica.model.product.Product;
import co.com.pruebatecnica.usecase.retrieve.RetrieveUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/apiRetrieve", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
/**
  Clase encargada de exponer los servicios con la responsabilidad de consultar la data de la Base de datos
 */
public class ApiRestRetrieve {
    private final RetrieveUseCase retrieveUseCase;


    @GetMapping(path = "/retrieveClient/{id_cliente}")
    public Client retrieveClient(@PathVariable(value = "id_cliente") int idCliente) {
      return retrieveUseCase.retrieveClient(idCliente);
    }
    @GetMapping(path = "/retrieveClients")
    public List<Client> retrieveClient() {
        return retrieveUseCase.retrieveClients();
    }

    @GetMapping(path = "/retrieveProduct")
    public List<Product> retrieveProducts() {
        return retrieveUseCase.retrieveProducts();
    }

    @GetMapping(path = "/retrieveProduct/{id_producto}")
    public Product retrieveProduct(@PathVariable(value = "id_producto") int idProducto) {
        return retrieveUseCase.retrieveProduct(idProducto);
    }

    @GetMapping(path = "/retrieveBill/{id_cliente}")
    public List<Bill> retrieveBill(@PathVariable(value = "id_cliente") int idCliente) {
        return retrieveUseCase.retrieveBill(idCliente);
    }

    @GetMapping(path = "/retrieveDetails/{num_factura}")
    public List<Detail> retrieveDetails(@PathVariable(value = "num_factura") Long numFactura) {
        return retrieveUseCase.retrieveDetails(numFactura);
    }
}
