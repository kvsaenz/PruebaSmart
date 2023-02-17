package co.com.pruebatecnica.jpa.repository;

import co.com.pruebatecnica.jpa.modelJPA.DetailData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPADetailRepository extends CrudRepository<DetailData, Long> {

}
