package parsing;

import org.biojavax.bio.seq.RichSequence;

public class ExtractProteinAttribute {

	private static int idProteinAttribute=0;
	private int sequenceLenght;
	private RichSequence richSequence;

	public ExtractProteinAttribute(RichSequence richSequence) {
		this.richSequence = richSequence;
		this.extractInfo();
		this.idProteinAttribute++;
	}
	
	public void extractInfo() {
		this.sequenceLenght=this.richSequence.seqString().length();
	}
}
