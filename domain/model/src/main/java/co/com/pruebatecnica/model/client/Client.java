package co.com.pruebatecnica.model.client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private int id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date fecha_nacimiento;
    private int telefono;
    private String email;

}
