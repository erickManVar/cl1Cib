package aw1.clase2;

import javax.persistence.Entity;
import javax.persistence.Id;

// POJO (Plain Java Object) de una clase que no esta atada a un framework o libreria
// una clase que se puede persistir en una BD es una Entidad
// una entidad se mapea con una tabla en la BD
// una tabla siempre tiene un primary key

@Entity
public class Producto { // tb_producto
	@Id
	String codigo;
	String descripcion;
	Integer stock;
	Double precio;
	String categoria;
}
