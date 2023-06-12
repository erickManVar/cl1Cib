package aw1.clase2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id
	String dni;
	String nombre;
	String apellido;	
}
