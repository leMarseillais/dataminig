package calcul;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Protein {

	private int typeProtein;
	private int numHelix;
	private int numSheet;
	private int numTurn;
	private int numTransmembrane;
	private int numIntermembrane;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public Protein(int id_entry) {
		entityManagerFactory =Persistence.createEntityManagerFactory("dataMining");
		entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		//System.out.println(entityManager.createQuery("SELECT t FROM TableDeFait t;").getResultList());
		int idCompo=(Integer) entityManager.createQuery("SELECT t.composition FROM TableDeFait t WHERE t.idEntry='1';").getSingleResult();
		//int percent =(Integer) entityManager.createQuery("SELECT sum(Composition.g,Composition.a,Composition.v,Composition.l,Composition.i,Composition.m,Composition.p,Composition.f,Composition.w)/ProteinAttribute.sequenceLenght FROM Composition ProteinAttribute TableDeFait WHERE TableDeFait.idEntry='1' and TableDeFait.composition=Composition.idComposition and TableDeFait.proteinAttribute=ProteinAttribute.idAttributes ;").getSingleResult();
		//System.out.println(percent);
		entityManager.close();
		
	}
	
	public static void main(String[] args) {
		Protein protein=new Protein(1);
	}
	
}
