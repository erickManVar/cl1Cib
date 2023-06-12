package aw1.clase2;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ObtenerProducto {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cocinaDb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// select * from producto where codigo = JLK-123
		
		
		String codigo = "JLK-123"; // tipo de ataque malicioso: sql inyeccion
		
		// jpql y sql, en jpql nosotros usamos el nombre de la clase no el nombre de la tabla en la bd
		TypedQuery<Producto> query = entityManager.createQuery(
				"select p from Producto p where p.codigo = :codigo ", 
				Producto.class
		);
		query.setParameter("codigo", codigo);
		
		Producto frutiflex = query.getSingleResult();
		System.out.println(frutiflex.descripcion);
	}
}
