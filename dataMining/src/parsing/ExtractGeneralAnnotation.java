package parsing;

import java.util.List;
import java.util.Set;

import org.biojavax.bio.seq.RichSequence;

public class ExtractGeneralAnnotation {
	
	private static int idGeneralAnnotation=0;
	private String biophysicochemicalProperties="";
	private String pathway = "";
	private String subscellularLocation = "";
	private String tissueSpecificity = "";
	private RichSequence richSequence;

	public ExtractGeneralAnnotation(RichSequence richSequence) {
		this.richSequence = richSequence;
		this.extractInfo();
		this.idGeneralAnnotation++;
	}

	public void extractInfo() {
		Set comments = this.richSequence.getComments();
		for (Object comment : comments) {
			String com = comment.toString();
			com = com.replace("\n", " ");
			System.out.println(com);
			String[] coms = com.split("\\[", 0);
			for (String c : coms) {
				System.out.println(c);
				System.out.println("sigcvbis sibc ib");
				if (c.contains("TISSUE SPECIFICITY]")) {
					this.tissueSpecificity += c.substring(20) + " ";
				}
				if (c.contains("SUBCELLULAR LOCATION]")) {
					this.subscellularLocation += c.substring(22) + " ";
				}
				if (c.contains("PATHWAY]")){
					this.pathway+=c.substring(9);
				}
				if (c.contains("BIOPHYSICOCHEMICAL PROPERTIES]")){
					this.biophysicochemicalProperties+=c.substring(30);
				}
			}

		}
	}

	@Override
	public String toString() {
		return "ExtractGeneralAnnotation [biophysicochemicalProperties="
				+ biophysicochemicalProperties + ", pathway=" + pathway
				+ ", subscellularLocation=" + subscellularLocation
				+ ", tissueSpecificity=" + tissueSpecificity + "]";
	}
	

}
