package co.com.pruebatecnica.jpa.modelJPA;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailPKData implements Serializable {

    @Column(name = "num_detalle")
    private Long num_detalle;

    @Column(name = "id_factura")
    private Long id_factura;

}
