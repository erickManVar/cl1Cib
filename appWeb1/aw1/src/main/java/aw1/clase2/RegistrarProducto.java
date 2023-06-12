package aw1.clase2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RegistrarProducto {
	public static void main(String[] args) {
		Producto clonazepam = new Producto();
		clonazepam.codigo = "CLO-123";
		clonazepam.categoria = "SEDANTE";
		clonazepam.descripcion = "Clonazepam es un farmaco ...";
		clonazepam.precio = 4.0;
		clonazepam.stock = 20;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cocinaDb");
		
		// Es un administrador de entidades con ello usted puede realizar operaciones CRUD (create, read, update, delete)
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// tanto para crear, editar o eliminar es necesario que use transacciones
		
		entityManager.getTransaction().begin();
		entityManager.persist(clonazepam);
		entityManager.getTransaction().commit();
		
		System.out.println("Producto registrado correctamente");
		
		
	}
}
