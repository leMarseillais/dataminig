package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the general_annotation database table.
 * 
 */
@Entity
@Table(name="general_annotation")
public class GeneralAnnotation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_general_annotation")
	private Integer idGeneralAnnotation;

	@Column(name="biophysicochemical_priopoerties")
	private String biophysicochemicalPriopoerties;

	private String pathway;

	@Column(name="subscellular_location")
	private String subscellularLocation;

	@Column(name="tissue_specificity")
	private String tissueSpecificity;

	//bi-directional many-to-one association to TableDeFait
	@OneToMany(mappedBy="generalAnnotation")
	private Set<TableDeFait> tableDeFaits;

    public GeneralAnnotation() {
    }

	public Integer getIdGeneralAnnotation() {
		return this.idGeneralAnnotation;
	}

	public void setIdGeneralAnnotation(Integer idGeneralAnnotation) {
		this.idGeneralAnnotation = idGeneralAnnotation;
	}

	public String getBiophysicochemicalPriopoerties() {
		return this.biophysicochemicalPriopoerties;
	}

	public void setBiophysicochemicalPriopoerties(String biophysicochemicalPriopoerties) {
		this.biophysicochemicalPriopoerties = biophysicochemicalPriopoerties;
	}

	public String getPathway() {
		return this.pathway;
	}

	public void setPathway(String pathway) {
		this.pathway = pathway;
	}

	public String getSubscellularLocation() {
		return this.subscellularLocation;
	}

	public void setSubscellularLocation(String subscellularLocation) {
		this.subscellularLocation = subscellularLocation;
	}

	public String getTissueSpecificity() {
		return this.tissueSpecificity;
	}

	public void setTissueSpecificity(String tissueSpecificity) {
		this.tissueSpecificity = tissueSpecificity;
	}

	public Set<TableDeFait> getTableDeFaits() {
		return this.tableDeFaits;
	}

	public void setTableDeFaits(Set<TableDeFait> tableDeFaits) {
		this.tableDeFaits = tableDeFaits;
	}

	public GeneralAnnotation(Integer idGeneralAnnotation,
			String biophysicochemicalPriopoerties, String pathway,
			String subscellularLocation, String tissueSpecificity,
			Set<TableDeFait> tableDeFaits) {
		this.idGeneralAnnotation = idGeneralAnnotation;
		this.biophysicochemicalPriopoerties = biophysicochemicalPriopoerties;
		this.pathway = pathway;
		this.subscellularLocation = subscellularLocation;
		this.tissueSpecificity = tissueSpecificity;
		this.tableDeFaits = tableDeFaits;
	}
	
}