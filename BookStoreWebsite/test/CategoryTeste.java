import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Category;
import com.bookstore.entity.Users;

public class CategoryTeste {

	public static void main(String[] args) {

		Category cat = new Category();
		
		cat.setName("Java");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// iniciando uma transação
		entityManager.getTransaction().begin();

		// persistindo um objeto usuario
		entityManager.persist(cat);

		// comitando a transaçao
		entityManager.getTransaction().commit();

		entityManager.close();

		entityManagerFactory.close();

		System.out.println("Transação realizada com sucesso!");
	}
	
	
}
