package parsing;

import org.biojavax.bio.seq.RichSequence;

public class ExtractProteinAttribute {

	private int sequenceLenght;
	private RichSequence richSequence;

	public ExtractProteinAttribute(RichSequence richSequence) {
		this.richSequence = richSequence;
		this.extractInfo();
	}
	
	public void extractInfo() {
		this.sequenceLenght=this.richSequence.seqString().length();
	}
}
