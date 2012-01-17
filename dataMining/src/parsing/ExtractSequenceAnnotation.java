package parsing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.SequenceAnnotation;
import model.TableDeFait;

import org.biojava.bio.seq.Feature;
import org.biojavax.bio.seq.RichSequence;

public class ExtractSequenceAnnotation {

	private int idSequenceAnnotation=0;
	private Integer turn = 0;
	private Integer helix = 0;
	private Integer transmembrane = 0;
	private Integer intermembrane = 0;
	private Integer betaStrand = 0;
	private RichSequence richSequence;
	private SequenceAnnotation sequenceAnnotation;
	private Set<TableDeFait> tableDeFaits= new HashSet<TableDeFait>();

	public ExtractSequenceAnnotation(int count, RichSequence richSequence,TableDeFait tableDeFait) {
		this.richSequence = richSequence;
		this.extractInfo();
		this.idSequenceAnnotation=count;
		this.tableDeFaits.add(tableDeFait);
		this.sequenceAnnotation=new SequenceAnnotation(idSequenceAnnotation, turn, helix, transmembrane, intermembrane, betaStrand, tableDeFaits);
	}
	
	

	public SequenceAnnotation getSequenceAnnotation() {
		return sequenceAnnotation;
	}



	public int getIdSequenceAnnotation() {
		return idSequenceAnnotation;
	}


	public void extractInfo() {
		Set<Feature> features = this.richSequence.getFeatureSet();
		for (Iterator iterator = features.iterator(); iterator.hasNext();) {
			Feature feature = (Feature) iterator.next();
			String annotation = feature.getAnnotation().toString();
			if (annotation.contains("turn")||annotation.contains("Turn")) {
				this.turn++;
			}
			if (annotation.contains("Helical")||annotation.contains("helical")) {
				this.helix++;
			}
			if (annotation.contains("Transmembrane")||annotation.contains("transmembrane")){
				this.transmembrane++;
			}
			if (annotation.contains("Intermembrane")||annotation.contains("intermembrane")){
				this.intermembrane++;
			}
			if (annotation.contains("Beta-strand")||annotation.contains("beta-strand")){
				this.betaStrand++;
			}
			
		}
	}

	@Override
	public String toString() {
		return "ExtractSequenceAnnotation [turn=" + turn + ", helix=" + helix
				+  ", transmembrane=" + transmembrane
				+ ", intermembrane=" + intermembrane 
				+ ", betaStrand=" + betaStrand + "]";
	}
}
