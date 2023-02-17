package co.com.pruebatecnica.model.detail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Detail {
    private Long num_detalle;
    private Long id_factura;
    private int id_producto;
    private int cantidad;
    private int precio;
}
