package aw1.clase2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RegistrarPersona {
	public static void main(String[] args) {
		Persona arthur = new Persona();
		arthur.apellido = "Mauricio";
		arthur.nombre = "Arthur";
		arthur.dni = "73646447";
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cocinaDb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(arthur); // persist es INSERT 
		entityManager.getTransaction().commit();
		
		System.out.println("Se registro correctamente");
		
	}
}
