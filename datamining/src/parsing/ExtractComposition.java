package src.parsing;

import org.biojavax.bio.seq.RichSequence;


public class ExtractComposition {
	private RichSequence genBank;
	private String sequence;
	public ExtractComposition(RichSequence file) {
		this.genBank = file;
		extractInfo();
	}
	
	public void extractInfo(){
	}
}
