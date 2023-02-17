package co.com.pruebatecnica.jpa.modelJPA;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailData {

    @EmbeddedId
    private DetailPKData clave;

    @Column(name = "id_producto")
    private int id_producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio")
    private int precio;

}
