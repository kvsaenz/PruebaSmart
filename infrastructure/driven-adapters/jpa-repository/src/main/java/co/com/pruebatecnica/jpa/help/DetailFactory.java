package co.com.pruebatecnica.jpa.help;

import co.com.pruebatecnica.jpa.modelJPA.DetailData;
import co.com.pruebatecnica.jpa.modelJPA.DetailPKData;
import co.com.pruebatecnica.model.detail.Detail;

public class DetailFactory {


    public DetailData billToData(Detail detail) {
        return new DetailData().builder()
                .clave(new DetailPKData().builder()
                        .num_detalle(detail.getNum_detalle())
                        .id_factura(detail.getId_factura())
                        .build())
                .id_producto(detail.getId_producto())
                .cantidad(detail.getCantidad())
                .precio(detail.getPrecio())
                .build();
    }

    public Detail dataToBill(DetailData detail) {
        return new Detail().builder()
                .num_detalle(detail.getClave().getNum_detalle())
                .id_factura(detail.getClave().getId_factura())
                .id_producto(detail.getId_producto())
                .cantidad(detail.getCantidad())
                .precio(detail.getPrecio())
                .build();
    }
}
