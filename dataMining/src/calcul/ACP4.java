package calcul;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TableDeFait;

public class ACP4 {

    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static int numOfCluster = 5;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
	ArrayList<Protein> proteins = new ArrayList<Protein>();
	entityManagerFactory = Persistence
		.createEntityManagerFactory("dataMining");
	entityManager = entityManagerFactory.createEntityManager();

	entityManager.getTransaction().begin();
	List<TableDeFait> tableDeFaits = (List<TableDeFait>) entityManager
		.createQuery("SELECT t FROM TableDeFait t").getResultList();
	for (TableDeFait tableDeFait : tableDeFaits) {
	    proteins.add(new ProteinForACP4(tableDeFait));
	}
	Collections.sort(proteins);
	String line = new String();
	line = proteins.size() + " 5\n";
	for (int i = 0; i < proteins.size(); i++) {
	    Protein protein = proteins.get(i);

	    line += protein.getNumTransmembrane() + " "
		    + protein.getNumIntermembrane() + "\n";

	}
	for (int i = 0; i < numOfCluster; i++) {
	    for (int j = 0; j < proteins.size() / numOfCluster; j++) {
		((Protein) proteins.get((i * proteins.size() / numOfCluster)
			+ j)).setTypeProtein(i + 1);
	    }
	}
	for (Protein protein : proteins) {
	    System.out.println(protein.getHydrophobicity());
	    System.out.println(protein.getTypeProtein());
	}
	StringReader stringReader = new StringReader(line);
	BufferedReader br = new BufferedReader(stringReader);
	ACPCalcul calcul = new ACPCalcul(br);
	System.out.println("\n");
	entityManager.close();
    }

}
