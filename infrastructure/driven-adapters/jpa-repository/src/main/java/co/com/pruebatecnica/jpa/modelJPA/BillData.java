package co.com.pruebatecnica.jpa.modelJPA;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FACTURA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillData {

    @Id
    @Column(name = "num_factura")
    private String num_factura;

    @Column(name = "id_cliente")
    private int id_cliente;

    @Column(name = "fecha")
    private String fecha;

}
