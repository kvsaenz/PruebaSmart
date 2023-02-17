package co.com.pruebatecnica.jpa.modelJPA;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "CLIENTE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientData {

    @Id
    @Column(name = "id_cliente")
    private int id_cliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;
    @Column(name = "telefono")
    private int telefono;
    @Column(name = "email")
    private String email;

}
