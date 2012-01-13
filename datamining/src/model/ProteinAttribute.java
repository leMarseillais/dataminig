package model;

// default package
// Generated 13 janv. 2012 16:20:29 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProteinAttribute generated by hbm2java
 */
@Entity
@Table(name = "protein_attribute", schema = "public")
public class ProteinAttribute implements java.io.Serializable, ModelInterface {

	private int idAttributes;
	private Integer sequenceLenght;
	private Set<TableDeFait> tableDeFaits = new HashSet<TableDeFait>(0);

	public ProteinAttribute() {
	}

	public ProteinAttribute(int idAttributes) {
		this.idAttributes = idAttributes;
	}

	public ProteinAttribute(int idAttributes, Integer sequenceLenght,
			Set<TableDeFait> tableDeFaits) {
		this.idAttributes = idAttributes;
		this.sequenceLenght = sequenceLenght;
		this.tableDeFaits = tableDeFaits;
	}

	@Id
	@Column(name = "id_attributes", unique = true, nullable = false)
	public int getIdAttributes() {
		return this.idAttributes;
	}

	public void setIdAttributes(int idAttributes) {
		this.idAttributes = idAttributes;
	}

	@Column(name = "sequence_lenght")
	public Integer getSequenceLenght() {
		return this.sequenceLenght;
	}

	public void setSequenceLenght(Integer sequenceLenght) {
		this.sequenceLenght = sequenceLenght;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proteinAttribute")
	public Set<TableDeFait> getTableDeFaits() {
		return this.tableDeFaits;
	}

	public void setTableDeFaits(Set<TableDeFait> tableDeFaits) {
		this.tableDeFaits = tableDeFaits;
	}

}
