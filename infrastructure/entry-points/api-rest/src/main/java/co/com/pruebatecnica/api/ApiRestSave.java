package co.com.pruebatecnica.api;

import co.com.pruebatecnica.model.bill.Bill;
import co.com.pruebatecnica.model.client.Client;
import co.com.pruebatecnica.model.detail.Detail;
import co.com.pruebatecnica.model.product.Product;
import co.com.pruebatecnica.usecase.save.SaveUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/apiSave", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
/**
 * Clase para exponer los servicios con la responsabilidad de persistir datos en la Base de datos
  */
public class ApiRestSave {
    private final SaveUseCase saveUseCase;


    @PostMapping(path = "/saveClient", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveClient(@RequestBody Client client) {
      return String.valueOf(saveUseCase.saveClient(client));
    }

    @PostMapping(path = "/saveProduct", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveProduct(@RequestBody Product product) {
      return String.valueOf(saveUseCase.saveProduct(product));
    }

    @PostMapping(path = "/saveBill", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveBill(@RequestBody Bill bill) {
        return String.valueOf(saveUseCase.saveBill(bill));
    }

    @PostMapping(path = "/saveDetail", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveDetail(@RequestBody Detail detail) {
        return String.valueOf(saveUseCase.saveDetail(detail));
    }


    @GetMapping(path = "/health")
    public String health() {
        return "Hello World";
    }
}
