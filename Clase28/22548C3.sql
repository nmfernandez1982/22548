use db22548;

select * from clientes;
select * from provincias;

insert into provincias values(3,"Misiones");
insert into provincias values(4,"Formosa");
insert into provincias values(5,"Santa Cruz");




select DNI as 'Nro. Doc.' ,NOMBRE,APELLIDO,clientes.ID_PROVINCIA as 'Cod. Provincia',NOMBRE_PROVINCIA as 'Provincia' from clientes
inner join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA;

select DNI as 'Nro. Doc.' ,NOMBRE,APELLIDO,clientes.ID_PROVINCIA as 'Cod. Provincia',NOMBRE_PROVINCIA as 'Provincia' from clientes
join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA;


select DNI as 'Nro. Doc.' ,NOMBRE,APELLIDO,clientes.ID_PROVINCIA as 'Cod. Provincia',NOMBRE_PROVINCIA as 'Provincia' from clientes
left join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA;

select DNI as 'Nro. Doc.' ,NOMBRE,APELLIDO,clientes.ID_PROVINCIA as 'Cod. Provincia',
NOMBRE_PROVINCIA as 'Provincia' from clientes
right join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA;


/*Transacciones*/


select * from provincias;

start transaction;
insert into provincias values (6,'Chubut');
commit;
rollback;

/*Funciones de los string*/


select DNI as 'Nro. Doc.' ,NOMBRE,APELLIDO,NOMBRE_PROVINCIA as 'Provincia',replace(estado,1,'No Habilitado') as 'Habilitado'from clientes
inner join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA where estado=1;

select DNI as 'Nro. Doc.',concat(NOMBRE,', ',APELLIDO),NOMBRE_PROVINCIA as 'Provincia',replace(estado,1,'No Habilitado') as 'Habilitado'from clientes
inner join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA where estado=1;

select DNI as 'Nro. Doc.',concat(lower(NOMBRE),', ',upper(APELLIDO)),NOMBRE_PROVINCIA as 'Provincia',replace(estado,1,'No Habilitado') as 'Habilitado'from clientes
inner join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA where estado=1;

select DNI as 'Nro. Doc.',concat(lower(NOMBRE),', ',upper(APELLIDO)),length(concat(lower(NOMBRE),', ',upper(APELLIDO))) ,NOMBRE_PROVINCIA as 'Provincia',replace(estado,1,'No Habilitado') as 'Habilitado'from clientes
inner join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA where estado=1;

select length("Codo a Codo");

select reverse("Codo a Codo");

select * from clientes;

select sum(DNI) from clientes;

select count(*) from clientes;

select avg(DNI) from clientes;

select min(DNI) from clientes;



select max(DNI) from clientes;





