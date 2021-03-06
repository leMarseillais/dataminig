package parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Composition;
import model.EntryInformation;
import model.GeneralAnnotation;
import model.ProteinAttribute;
import model.SequenceAnnotation;
import model.TableDeFait;

import org.biojava.bio.BioException;
import org.biojavax.SimpleNamespace;
import org.biojavax.bio.seq.RichSequence;
import org.biojavax.bio.seq.RichSequenceIterator;

public class ReadSwiss {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		String filename = "/Users/sebastienbeauquis/Documents/cours/Classification/db_datamining/tests/";

		BufferedReader[] br = null;
		try {
			br = readInputFile(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			entityManagerFactory =Persistence.createEntityManagerFactory("dataMining");
			entityManager = entityManagerFactory.createEntityManager();
			
			entityManager.getTransaction().begin();
			
			int count=0;
			
			for (BufferedReader bR : br) {
				SimpleNamespace namespace = new SimpleNamespace("biojava");
				RichSequenceIterator richSequenceIterator = RichSequence.IOTools
						.readGenbankProtein(bR, namespace);
				
				while (richSequenceIterator.hasNext()) {
					count++;
					RichSequence sequence = richSequenceIterator
							.nextRichSequence();
					TableDeFait tableDeFait=new TableDeFait();
					
					ExtractEntryInformation entryInformation = new ExtractEntryInformation( count,
							sequence, tableDeFait);
					tableDeFait.setEntryInformation(entryInformation.getEntryInformation());
					tableDeFait.setIdEntry(entryInformation.getEntryInformation().getIdEntry());
					
					ExtractComposition composition = new ExtractComposition( count,
							sequence, tableDeFait);
					tableDeFait.setComposition(composition.getComposition());
					
					ExtractGeneralAnnotation generalAnnotation = new ExtractGeneralAnnotation( count,
							sequence, tableDeFait);
					tableDeFait.setGeneralAnnotation(generalAnnotation.getGeneralAnnotation());
					
					ExtractProteinAttribute proteinAttribute = new ExtractProteinAttribute( count,
							sequence, tableDeFait);
					tableDeFait.setProteinAttribute(proteinAttribute.getProteinAttribute());
					
					ExtractSequenceAnnotation sequenceAnnotation = new ExtractSequenceAnnotation( count,
							sequence, tableDeFait);
					tableDeFait.setSequenceAnnotation(sequenceAnnotation.getSequenceAnnotation());
					
					if (entityManager.find(EntryInformation.class, entryInformation.getIdProtein())!=null){
						entityManager.merge(entryInformation);
					}else{
						entityManager.persist(entryInformation.getEntryInformation());
					}
					if (entityManager.find(Composition.class, composition.getIdComposition())!=null) {
						entityManager.merge(composition);
					} else {
						entityManager.persist(composition.getComposition());
					}
					if (entityManager.find(GeneralAnnotation.class, generalAnnotation.getIdGeneralAnnotation())!=null) {
						entityManager.merge(generalAnnotation);
					} else {
						entityManager.persist(generalAnnotation.getGeneralAnnotation());	
					}
					if (entityManager.find(ProteinAttribute.class, proteinAttribute.getIdProteinAttribute())!=null) {
						entityManager.merge(proteinAttribute);
					} else {
						entityManager.persist(proteinAttribute.getProteinAttribute());
					}
					if (entityManager.find(SequenceAnnotation.class, sequenceAnnotation.getIdSequenceAnnotation())!=null) {
						entityManager.merge(sequenceAnnotation);
					} else {
						entityManager.persist(sequenceAnnotation.getSequenceAnnotation());
					}
					if (entityManager.find(TableDeFait.class, tableDeFait.getIdEntry())!=null) {
						entityManager.merge(tableDeFait);
					} else {
						entityManager.persist(tableDeFait);
					}
					
				}

			}
			entityManager.getTransaction().commit();
			entityManager.close();
			

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static BufferedReader[] readInputFile(String filename)
			throws IOException {
		File entree = new File(filename);
		String[] filesPath = entree.list();
		BufferedReader[] br = new BufferedReader[filesPath.length-1];
		int compteur = 0;
		for (String filePath : filesPath) {
			if (!filePath.startsWith(".")) {
				entree = new File(filename + filePath);
				br[compteur] = new BufferedReader(new InputStreamReader(
						new FileInputStream(entree), "UTF8"));
				compteur++;
			}			
		}
		return br;
	}
}
