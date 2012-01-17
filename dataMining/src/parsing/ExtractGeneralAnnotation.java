package parsing;

import java.util.HashSet;
import java.util.Set;

import model.GeneralAnnotation;
import model.TableDeFait;

import org.biojavax.bio.seq.RichSequence;

public class ExtractGeneralAnnotation {
	
	private int idGeneralAnnotation=0;
	private GeneralAnnotation generalAnnotation;
	private String biophysicochemicalProperties="";
	private String pathway = "";
	private String subscellularLocation = "";
	private String tissueSpecificity = "";
	private RichSequence richSequence;
	private Set<TableDeFait> tableDeFaits= new HashSet<TableDeFait>();

	public ExtractGeneralAnnotation(int count, RichSequence richSequence,TableDeFait tableDeFait) {
		this.richSequence = richSequence;
		this.extractInfo();
		this.idGeneralAnnotation=count;
		this.tableDeFaits.add(tableDeFait);
		this.generalAnnotation=new GeneralAnnotation(idGeneralAnnotation, pathway, tissueSpecificity, subscellularLocation, biophysicochemicalProperties, tableDeFaits);
	}
	
	

	public GeneralAnnotation getGeneralAnnotation() {
		return generalAnnotation;
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
