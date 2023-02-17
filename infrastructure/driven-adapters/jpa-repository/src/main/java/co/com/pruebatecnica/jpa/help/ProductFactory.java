package co.com.pruebatecnica.jpa.help;

import co.com.pruebatecnica.jpa.modelJPA.ProductData;
import co.com.pruebatecnica.model.product.Product;

public class ProductFactory {

    public ProductData productToData(Product product) {
        return new ProductData().builder()
                .id_producto(product.getId_producto())
                .nombre(product.getNombre())
                .precio(product.getPrecio())
                .stock(product.getStock())
                .build();
    }

    public Product dataToProduct(ProductData product) {
        return new Product().builder()
                .id_producto(product.getId_producto())
                .nombre(product.getNombre())
                .precio(product.getPrecio())
                .stock(product.getStock())
                .build();
    }
}
