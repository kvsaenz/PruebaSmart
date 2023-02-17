package co.com.pruebatecnica.model.bill;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Bill {

    private String num_factura;
    private int id_cliente;
    private String fecha;
}
