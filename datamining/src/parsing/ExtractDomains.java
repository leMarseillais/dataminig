package parsing;

import java.util.Iterator;
import java.util.Set;

import org.biojava.bio.seq.Feature;
import org.biojavax.bio.seq.RichSequence;

public class ExtractDomains {
	
	private static int idDomain;
	private String name;
	private int idTableDeFait;
	private RichSequence genBank;
	
	public ExtractDomains(RichSequence sequence) {
		super();
		this.genBank = sequence;
		this.extractInfo();
	}

	public String getName() {
		return name;
	}
	
	public void extractInfo(){
		Set<Feature> featuireSet =this.genBank.getFeatureSet();
		for (Iterator iterator = featuireSet.iterator(); iterator.hasNext();) {
			Feature feature = (Feature) iterator.next();
			if (feature.getType()=="Region"){
			}
		}
	}
	
}
