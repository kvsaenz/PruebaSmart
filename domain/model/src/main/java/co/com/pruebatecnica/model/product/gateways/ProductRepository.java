package co.com.pruebatecnica.model.product.gateways;

import co.com.pruebatecnica.model.product.Product;

import java.util.List;

public interface ProductRepository {
    boolean saveProduct(Product product);

    Product retrieveProduct(int idProducto);

    List<Product> retrieveProducts();
}
