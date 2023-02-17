package co.com.pruebatecnica.jpa.repository;

import co.com.pruebatecnica.jpa.modelJPA.ClientData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPAClientRepository extends CrudRepository<ClientData, Integer> {

}
