package parsing;

import org.biojavax.bio.seq.RichSequence;


public class ExtractEntryInformation {
	
	String idProteine;
	String nomProteine;
	RichSequence genBank;
	
	public ExtractEntryInformation(RichSequence sequence) {
		this.genBank = sequence;
		extractInfo();
	}
	
	public void extractInfo(){
		this.idProteine=this.genBank.getAccession();
		this.nomProteine=this.genBank.getName();
		
	}
}
