package parsing;

import org.biojavax.bio.seq.RichSequence;


public class ExtractEntryInformation {
	
	private static int idProtein=0;
	private String nomProteine;
	private RichSequence genBank;
	
	public ExtractEntryInformation(RichSequence sequence) {
		this.genBank = sequence;
		extractInfo();
		this.idProtein++;
	}
	
	public static int getIdProtein() {
		return idProtein;
	}

	public void extractInfo(){
		this.nomProteine=this.genBank.getName();
		
	}
}
