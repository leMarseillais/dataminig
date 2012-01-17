package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Services {
	
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;
	
	public void save(){
		entityManagerFactory =Persistence.createEntityManagerFactory("dataMining");
		entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
