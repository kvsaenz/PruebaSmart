# APLICACIÓN

La idea del ejercicio es exponer servicios REST en JAVA por medio de los cuales se pueda registrar una factura junto con
sus ítems, debido a que no se realizará Front para este ejercicio, se listarán los servicios a realizar.

* Registrar datos del cliente en la tabla CLIENTE.
    * /apiSave/saveClient
* Registrar datos en la tabla PRODUCTO.
    * /apiSave/saveProduct
* Registrar datos en la tabla FACTURA.
    * /apiSave/saveBill
* Registrar datos en la tabla DETALLE.
    * /apiSave/saveDetail
* Consulta de clientes del sistema.
    * /apiRetrieve/retrieveClients
    * /apiRetrieve/retrieveClient/{id_cliente}
* Consulta de productos del sistema.
    * /apiRetrieve/retrieveProducts
    * /apiRetrieve/retrieveProduct/{id_producto}
* Consulta de facturas por ID_CLIENTE.
    * /apiRetrieve/retrieveBill/{id_cliente}
* Consulta del detalle de factura por ID_FACTURA.
    * /apiRetrieve/retrieveDetails/{num_factura}

Adicionalmente, realizar las pruebas unitarias de los métodos.
Por favor responder este correo con el código en Git o donde estime conveniente y evidencias de los pantallazos de lo
realizado.

### Generación del proyecto [scaffold-clean-architecture](https://github.com/bancolombia/scaffold-clean-architecture/)
- plugins {
  id "co.com.bancolombia.cleanArchitecture" version "2.4.10"
  }
- gradle cleanArchitecture --package=co.com.pruebatecnica --type=imperative --name=PruebaTecnica --coverage=jacoco --lombok=true
- gradle generateEntryPoint --type=restmvc --server=tomcat
- gradle generateUseCase --name=Save
- gradle generateUseCase --name=Retrieve
- gradle generateModel --name=Client
- gradle generateModel --name=Product
- gradle generateModel --name=Bill
- gradle generateModel --name=Detail
- gradle generateDrivenAdapter --type=jpa