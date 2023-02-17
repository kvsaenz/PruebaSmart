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


Utilización:

Se debe compilar el proyecto ejecutando un gradle build y luego iniciar la 
aplicación desde la clase **MainApplication.java**

Proyecto utiliza base de datos Mysql con el siguiente script

[Modelo de Base de datos ](deployment%2FCREATE%20TABLE%20CLIENTE.sql)


[PruebaTecnica.postman_collection.json](deployment%2Fevidencias%2FPruebaTecnica.postman_collection.json)

* Registrar datos del cliente en la tabla CLIENTE.
  * /apiSave/saveClient
    * ![saveClient](deployment%2Fevidencias%2FsaveClient.png)
    * 
* Registrar datos en la tabla PRODUCTO.
  * /apiSave/saveProduct
    * ![SaveProduct](deployment%2Fevidencias%2FSaveProduct.png)
* Registrar datos en la tabla FACTURA.
  * /apiSave/saveBill
    * ![saveBill](deployment%2Fevidencias%2FsaveBill.png)
* Registrar datos en la tabla DETALLE.
  * /apiSave/saveDetail
    * ![saveDetail](deployment%2Fevidencias%2FsaveDetail.png)
* Consulta de clientes del sistema.
  * /apiRetrieve/retrieveClients
    * ![RetrieveClients.png](deployment%2Fevidencias%2FRetrieveClients.png)
* Consulta de productos del sistema.
  * /apiRetrieve/retrieveProducts
    * ![RetrieveProducts](deployment%2Fevidencias%2FRetrieveProducts.png)
  * /apiRetrieve/retrieveProduct/{id_producto}
    * ![RetrieveProductsID](deployment%2Fevidencias%2FRetrieveProductsID.png)