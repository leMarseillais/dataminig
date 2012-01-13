package parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

import org.biojava.bio.BioException;
import org.biojavax.SimpleNamespace;
import org.biojavax.bio.seq.RichSequence;
import org.biojavax.bio.seq.RichSequenceIterator;

public class ReadSwiss {
	public static void main(String[] args) {
		String filename = "/Users/sebastienbeauquis/Documents/cours/Classification/db_datamining/tests/";

		BufferedReader[] br = null;
		try {
			br = readInputFile(filename);
			// System.out.println(br);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			for (BufferedReader bR : br) {

				SimpleNamespace namespace = new SimpleNamespace("biojava");
				RichSequenceIterator richSequenceIterator = RichSequence.IOTools
						.readGenbankProtein(bR, namespace);
				while (richSequenceIterator.hasNext()) {
					RichSequence sequence = richSequenceIterator
							.nextRichSequence();
					ExtractEntryInformation EntryInformation = new ExtractEntryInformation(
							sequence);
					ExtractComposition composition = new ExtractComposition(
							sequence);
					ExtractGeneralAnnotation generalAnnotation = new ExtractGeneralAnnotation(
							sequence);
					ExtractProteinAttribute proteinAttribute = new ExtractProteinAttribute(
							sequence);
					ExtractSequenceAnnotation sequenceAnnotation = new ExtractSequenceAnnotation(
							sequence);
				}

			}

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
