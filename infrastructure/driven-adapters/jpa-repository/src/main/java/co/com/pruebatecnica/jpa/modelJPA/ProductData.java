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
@Table(name = "PRODUCTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductData {

    @Id
    @Column(name = "id_producto")
    private int id_producto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private int precio;
    @Column(name = "stock")
    private int stock;

}
