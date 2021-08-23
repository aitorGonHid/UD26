create database recambios;
use recambios;

create table piezas(
id int auto_increment,
nombre varchar(100),
primary key(id)
);

create table proveedores(
id int auto_increment,
nombre varchar(100),
primary key(id)
);

create table suministra(
id int auto_increment,
precio int,
id_pieza int,
id_proveedor int,
primary key(id),
constraint piezas_fk foreign key(id_pieza) references piezas(id),
constraint proveedores_fk foreign key(id_proveedor) references proveedores(id)
);
