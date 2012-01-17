package calcul;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ACP {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entityManagerFactory =Persistence.createEntityManagerFactory("dataMining");
		entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.close();
	}

}
