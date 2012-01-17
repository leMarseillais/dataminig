package parsing;

import model.EntryInformation;
import model.TableDeFait;

import org.biojavax.bio.seq.RichSequence;


public class ExtractEntryInformation {
	
	private int idProtein;
	private String nomProteine;
	private RichSequence genBank;
	private EntryInformation entryInformation;
	
	public ExtractEntryInformation(int idProtein,RichSequence sequence,TableDeFait tableDeFait) {
		this.genBank = sequence;
		extractInfo();
		this.idProtein=idProtein;
		this.entryInformation=new EntryInformation(idProtein, nomProteine, tableDeFait);
	}
	
	public int getIdProtein() {
		return idProtein;
	}

	
	public EntryInformation getEntryInformation() {
		return entryInformation;
	}

	public void extractInfo(){
		this.nomProteine=this.genBank.getName();
		
	}
}
