package aw1.clase2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ListarProductos {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cocinaDb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		Cuando usamos JPA, no usamos SQL sino que usamos JPA + SQL = JPQL
		
		TypedQuery<Producto> query = entityManager.createQuery("select p from Producto p", Producto.class);
		List<Producto> productos = query.getResultList();
		
		for (Producto producto : productos) {
			System.out.println(producto.codigo);
			System.out.println(producto.descripcion);
		}
		
		
	}
}
