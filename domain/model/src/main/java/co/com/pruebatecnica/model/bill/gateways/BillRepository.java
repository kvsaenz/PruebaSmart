package co.com.pruebatecnica.model.bill.gateways;

import co.com.pruebatecnica.model.bill.Bill;

import java.util.List;

public interface BillRepository {

    boolean saveBill(Bill product);

    List<Bill> retrieveBill(int idCliente);
}
