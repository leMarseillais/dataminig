package src.parsing;

import java.util.Iterator;
import java.util.Set;

import org.biojavax.Note;
import org.biojavax.bio.seq.RichSequence;


public class ExtractFicheProteine {
	
	String idProteine;
	String nomProteine;
	String synonyme;
	String motclef;
	RichSequence sequence;
	
	public ExtractFicheProteine(RichSequence sequence) {
		this.sequence = sequence;
		extractInfo();
	}
	
	public void extractInfo(){
		this.idProteine=this.sequence.getAccession();
		this.nomProteine=this.sequence.getName();
		Set<Note> noteSet = this.sequence.getRichAnnotation().getNoteSet();
		for (Iterator<Note> iterator = noteSet.iterator(); iterator.hasNext();) {
			Note note = iterator.next();
			System.out.println(note.getValue());
		}
		
	}
}
