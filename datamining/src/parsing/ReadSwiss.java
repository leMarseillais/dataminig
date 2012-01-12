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
		String filename = "/Users/sebastienbeauquis/Documents/cours/Classification/db_datamining/tests/61212141";

		BufferedReader br = null;
		try {
			br = readInputFile(filename);
			System.out.println(br);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			SimpleNamespace namespace = new SimpleNamespace("biojava");
			RichSequenceIterator richSequenceIterator = RichSequence.IOTools
					.readGenbankProtein(br, namespace);
			while (richSequenceIterator.hasNext()) {
				RichSequence sequence = richSequenceIterator.nextRichSequence();
				ExtractFicheProteine extractFicheProteine=new ExtractFicheProteine(sequence);
				ExtractComposition extractComposition = new ExtractComposition(sequence);
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static BufferedReader readInputFile(String filename)
			throws IOException {
		File entree = new File(filename);
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(entree), "UTF8"));
		return br;
	}
}
