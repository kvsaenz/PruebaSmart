package co.com.pruebatecnica.jpa.repository;

import co.com.pruebatecnica.jpa.modelJPA.BillData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPABillRepository extends CrudRepository<BillData, Integer> {

}
