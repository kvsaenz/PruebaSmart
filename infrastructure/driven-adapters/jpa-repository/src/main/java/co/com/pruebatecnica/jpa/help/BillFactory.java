package co.com.pruebatecnica.jpa.help;

import co.com.pruebatecnica.jpa.modelJPA.BillData;
import co.com.pruebatecnica.model.bill.Bill;

public class BillFactory {

    ClientFactory clientFactory = new ClientFactory();
    public BillData billToData(Bill bill) {
        return new BillData().builder()
                //.id_cliente(clientFactory.clientToData(bill.getId_cliente()))
                .id_cliente(bill.getId_cliente())
                .num_factura(bill.getNum_factura())
                .fecha(bill.getFecha())
                .build();
    }

    public Bill dataToBill(BillData bill) {
        return new Bill().builder()
                //.id_cliente(clientFactory.dataToClient(bill.getId_cliente()))
                .id_cliente(bill.getId_cliente())
                .num_factura(bill.getNum_factura())
                .fecha(bill.getFecha())
                .build();
    }
}
