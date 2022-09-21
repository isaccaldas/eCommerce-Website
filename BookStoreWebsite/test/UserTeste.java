import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UserTeste {

	public static void main(String[] args) {

		Users user1 = new Users();

		user1.setEmail("teste2@teste.com");
		user1.setFullName("Isac Caldas2");
		user1.setPassword("1234");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// iniciando uma transação
		entityManager.getTransaction().begin();

		// persistindo um objeto usuario
		entityManager.persist(user1);

		// comitando a transaçao
		entityManager.getTransaction().commit();

		entityManager.close();

		entityManagerFactory.close();

		System.out.println("Transação realizada com sucesso!");
	}

}
