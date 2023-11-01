import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.Test;

import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;

public class UserDAOTest {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDAO;
	
	
	@Test
	public void getUsersTest() {
		
		Integer userId = 1;
		//Users user = UserDAO.get(userId);
		
		
		
	}
	
	
	

}
