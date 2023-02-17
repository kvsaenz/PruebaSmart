package co.com.pruebatecnica.jpa.service;

import co.com.pruebatecnica.jpa.help.ProductFactory;
import co.com.pruebatecnica.jpa.repository.JPAProductRepository;
import co.com.pruebatecnica.model.product.Product;
import co.com.pruebatecnica.model.product.gateways.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceJPA implements ProductRepository {

    @Autowired
    JPAProductRepository jpaProductRepository;

    private ProductFactory fact = new ProductFactory();

    @Override
    public boolean saveProduct(Product product) {
        jpaProductRepository.save(fact.productToData(product));
        return true;
    }

    @Override
    public Product retrieveProduct(int idProducto) {
        return fact.dataToProduct(jpaProductRepository.findById(idProducto).get());
    }

    @Override
    public List<Product> retrieveProducts() {
        List<Product> result = new ArrayList<>();
        jpaProductRepository.findAll().forEach( r ->{
                    result.add(fact.dataToProduct(r));
                }
        );
        return result;
    }
}
