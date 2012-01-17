package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the table_de_fait database table.
 * 
 */
@Entity
@Table(name="table_de_fait")
public class TableDeFait implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_entry",insertable=false, updatable=false)
	private Integer idEntry;

	//bi-directional many-to-one association to Composition
    @ManyToOne
	@JoinColumn(name="id_composition")
	private Composition composition;

	//bi-directional one-to-one association to EntryInformation
	@OneToOne
	@JoinColumn(name="id_entry")
	private EntryInformation entryInformation;

	//bi-directional many-to-one association to GeneralAnnotation
    @ManyToOne
	@JoinColumn(name="id_general_annotation")
	private GeneralAnnotation generalAnnotation;

	//bi-directional many-to-one association to ProteinAttribute
    @ManyToOne
	@JoinColumn(name="id_attributes")
	private ProteinAttribute proteinAttribute;

	//bi-directional many-to-one association to SequenceAnnotation
    @ManyToOne
	@JoinColumn(name="id_seq_annotation")
	private SequenceAnnotation sequenceAnnotation;

    public TableDeFait() {
    }

	public Integer getIdEntry() {
		return this.idEntry;
	}

	public void setIdEntry(Integer idEntry) {
		this.idEntry = idEntry;
	}

	public Composition getComposition() {
		return this.composition;
	}

	public void setComposition(Composition composition) {
		this.composition = composition;
	}
	
	public EntryInformation getEntryInformation() {
		return this.entryInformation;
	}

	public void setEntryInformation(EntryInformation entryInformation) {
		this.entryInformation = entryInformation;
	}
	
	public GeneralAnnotation getGeneralAnnotation() {
		return this.generalAnnotation;
	}

	public void setGeneralAnnotation(GeneralAnnotation generalAnnotation) {
		this.generalAnnotation = generalAnnotation;
	}
	
	public ProteinAttribute getProteinAttribute() {
		return this.proteinAttribute;
	}

	public void setProteinAttribute(ProteinAttribute proteinAttribute) {
		this.proteinAttribute = proteinAttribute;
	}
	
	public SequenceAnnotation getSequenceAnnotation() {
		return this.sequenceAnnotation;
	}

	public void setSequenceAnnotation(SequenceAnnotation sequenceAnnotation) {
		this.sequenceAnnotation = sequenceAnnotation;
	}

	public TableDeFait(Integer idEntry, Composition composition,
			EntryInformation entryInformation,
			GeneralAnnotation generalAnnotation,
			ProteinAttribute proteinAttribute,
			SequenceAnnotation sequenceAnnotation) {
		this.idEntry = idEntry;
		this.composition = composition;
		this.entryInformation = entryInformation;
		this.generalAnnotation = generalAnnotation;
		this.proteinAttribute = proteinAttribute;
		this.sequenceAnnotation = sequenceAnnotation;
	}
	
	
}