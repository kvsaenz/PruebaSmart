package co.com.pruebatecnica.jpa.repository;

import co.com.pruebatecnica.jpa.modelJPA.ProductData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPAProductRepository extends CrudRepository<ProductData, Integer> {

}
