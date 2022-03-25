CREATE TABLE PRODUCTOS (
id_producto INT NOT NULL AUTO_INCREMENT, 
    PRIMARY KEY(id_producto),nombre VARCHAR(150), precio INT
);/*no se puede dejar vacio, +1 automaticamente*/

CREATE TABLE CLIENTES(
id_cliente INT NOT NULL AUTO_INCREMENT, 
    PRIMARY KEY(id_cliente),nombre VARCHAR(100),
    apellido VARCHAR(100),edad INT, telefono INT
);

CREATE TABLE PEDIDOS(
id_pedido INT NOT NULL AUTO_INCREMENT, 
    PRIMARY KEY(id_pedido),fecha DATE, cantidad INT, 
    id_cliente INT, id_producto INT, FOREIGN KEY(id_cliente) REFERENCES CLIENTES(id_cliente), FOREIGN KEY(id_producto) REFERENCES PRODUCTOS(id_producto)
);/*si id_cliente es INT entonces aqui tambien es int*/