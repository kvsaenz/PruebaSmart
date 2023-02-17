package co.com.pruebatecnica.jpa.service;

import co.com.pruebatecnica.jpa.help.BillFactory;
import co.com.pruebatecnica.jpa.repository.JPABillRepository;
import co.com.pruebatecnica.model.bill.Bill;
import co.com.pruebatecnica.model.bill.gateways.BillRepository;
import co.com.pruebatecnica.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class BillServiceJPA implements BillRepository {

    @Autowired
    JPABillRepository jpaBillRepository;

    private BillFactory fact = new BillFactory();

    @Override
    public boolean saveBill(Bill bill) {
        jpaBillRepository.save(fact.billToData(bill));
        return true;
    }

    @Override
    public List<Bill> retrieveBill(int idCliente) {
        List<Bill> result = new ArrayList<>();
        jpaBillRepository.findById(idCliente).flatMap(x -> {
            result.add(fact.dataToBill(x));
            return null;
        });
        return result;
    }
}
