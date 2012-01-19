package parsing;

import java.util.HashSet;
import java.util.Set;

import model.ProteinAttribute;
import model.TableDeFait;

import org.biojavax.bio.seq.RichSequence;

public class ExtractProteinAttribute {

	private int idProteinAttribute=0;
	private int sequenceLenght;
	private RichSequence richSequence;
	private ProteinAttribute proteinAttribute;
	private Set<TableDeFait> tableDeFaits =new HashSet<TableDeFait>();

	public ExtractProteinAttribute(int count, RichSequence richSequence,TableDeFait tableDeFait) {
		this.richSequence = richSequence;
		this.extractInfo();
		this.idProteinAttribute=count;
		this.tableDeFaits.add(tableDeFait);
		this.proteinAttribute=new ProteinAttribute(idProteinAttribute, sequenceLenght, tableDeFaits);
	}
	
	public ProteinAttribute getProteinAttribute() {
		return proteinAttribute;
	}

	public int getIdProteinAttribute() {
		return idProteinAttribute;
	}

	public void extractInfo() {
		this.sequenceLenght=this.richSequence.seqString().length();
		System.out.println(this.richSequence.seqString());
	}
}
