package parsing;

import java.util.Iterator;
import java.util.Set;

import org.biojava.bio.seq.Feature;
import org.biojavax.bio.seq.RichSequence;

public class ExtractSequenceAnnotation {

	private Short turn = 0;
	private Short helix = 0;
	private Short site = 0;
	private Short transmembrane = 0;
	private Short intermembrane = 0;
	private Short chain = 0;
	private Short betaStrand = 0;
	private RichSequence richSequence;

	public ExtractSequenceAnnotation(RichSequence richSequence) {
		this.richSequence = richSequence;
		this.extractInfo();
		System.out.println(this);
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
				+ ", site=" + site + ", transmembrane=" + transmembrane
				+ ", intermembrane=" + intermembrane + ", chain=" + chain
				+ ", betaStrand=" + betaStrand + "]";
	}
}
