CREATE TABLE CLIENTE
 (
    id_cliente int PRIMARY KEY NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    direccion varchar(100) NOT NULL,
    fecha_nacimiento varchar(20) NOT NULL,
    telefono int(10) NOT NULL,
    email varchar(50) NOT NULL
 );


CREATE TABLE FACTURA
 (
    num_factura int PRIMARY KEY NOT NULL,
    id_cliente int NOT NULL,
    fecha varchar(20) NOT NULL
 );

ALTER TABLE FACTURA ADD FOREIGN KEY (id_cliente) REFERENCES CLIENTE (id_cliente);

CREATE TABLE PRODUCTO
 (
     id_producto int PRIMARY KEY NOT NULL,
     nombre varchar(50) NOT NULL,
     precio int(100) NOT NULL,
     stock int(100) NOT NULL
 );

CREATE TABLE DETALLE
 (
     num_detalle int NOT NULL,
     id_factura int NOT NULL,
     id_producto int NOT NULL,
     cantidad int(10) NOT NULL,
     precio int(100) NOT NULL
 );

ALTER TABLE DETALLE ADD PRIMARY KEY(num_detalle, id_factura);
ALTER TABLE DETALLE ADD FOREIGN KEY (id_producto) REFERENCES PRODUCTO(id_producto);
ALTER TABLE DETALLE ADD FOREIGN KEY (id_factura) REFERENCES FACTURA(num_factura);