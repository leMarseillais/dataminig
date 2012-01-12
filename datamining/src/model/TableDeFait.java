package model;

// default package
// Generated 12 janv. 2012 17:41:04 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * TableDeFait generated by hbm2java
 */
@Entity
@Table(name = "table_de_fait", schema = "public")
public class TableDeFait implements java.io.Serializable, ModelInterface {

	private int idEntry;
	private Domain domain;
	private Composition composition;
	private EntryInformation entryInformation;
	private ProteinAttribute proteinAttribute;
	private SequenceAnnotation sequenceAnnotation;
	private Function function;
	private GeneralAnnotation generalAnnotation;

	public TableDeFait() {
	}

	public TableDeFait(EntryInformation entryInformation) {
		this.entryInformation = entryInformation;
	}

	public TableDeFait(Domain domain, Composition composition,
			EntryInformation entryInformation,
			ProteinAttribute proteinAttribute,
			SequenceAnnotation sequenceAnnotation, Function function,
			GeneralAnnotation generalAnnotation) {
		this.domain = domain;
		this.composition = composition;
		this.entryInformation = entryInformation;
		this.proteinAttribute = proteinAttribute;
		this.sequenceAnnotation = sequenceAnnotation;
		this.function = function;
		this.generalAnnotation = generalAnnotation;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "entryInformation"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_entry", unique = true, nullable = false)
	public int getIdEntry() {
		return this.idEntry;
	}

	public void setIdEntry(int idEntry) {
		this.idEntry = idEntry;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_domain")
	public Domain getDomain() {
		return this.domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_composition")
	public Composition getComposition() {
		return this.composition;
	}

	public void setComposition(Composition composition) {
		this.composition = composition;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public EntryInformation getEntryInformation() {
		return this.entryInformation;
	}

	public void setEntryInformation(EntryInformation entryInformation) {
		this.entryInformation = entryInformation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_attributes")
	public ProteinAttribute getProteinAttribute() {
		return this.proteinAttribute;
	}

	public void setProteinAttribute(ProteinAttribute proteinAttribute) {
		this.proteinAttribute = proteinAttribute;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_seq_annotation")
	public SequenceAnnotation getSequenceAnnotation() {
		return this.sequenceAnnotation;
	}

	public void setSequenceAnnotation(SequenceAnnotation sequenceAnnotation) {
		this.sequenceAnnotation = sequenceAnnotation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_function")
	public Function getFunction() {
		return this.function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_general_annotation")
	public GeneralAnnotation getGeneralAnnotation() {
		return this.generalAnnotation;
	}

	public void setGeneralAnnotation(GeneralAnnotation generalAnnotation) {
		this.generalAnnotation = generalAnnotation;
	}

}