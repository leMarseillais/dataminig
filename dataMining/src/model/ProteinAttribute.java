package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the protein_attribute database table.
 * 
 */
@Entity
@Table(name="protein_attribute")
public class ProteinAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_attributes")
	private Integer idAttributes;

	@Column(name="sequence_lenght")
	private Integer sequenceLenght;

	//bi-directional many-to-one association to TableDeFait
	@OneToMany(mappedBy="proteinAttribute")
	private Set<TableDeFait> tableDeFaits;

    public ProteinAttribute() {
    }

	public Integer getIdAttributes() {
		return this.idAttributes;
	}

	public void setIdAttributes(Integer idAttributes) {
		this.idAttributes = idAttributes;
	}

	public Integer getSequenceLenght() {
		return this.sequenceLenght;
	}

	public void setSequenceLenght(Integer sequenceLenght) {
		this.sequenceLenght = sequenceLenght;
	}

	public Set<TableDeFait> getTableDeFaits() {
		return this.tableDeFaits;
	}

	public void setTableDeFaits(Set<TableDeFait> tableDeFaits) {
		this.tableDeFaits = tableDeFaits;
	}

	public ProteinAttribute(Integer idAttributes, Integer sequenceLenght,
			Set<TableDeFait> tableDeFaits) {
		this.idAttributes = idAttributes;
		this.sequenceLenght = sequenceLenght;
		this.tableDeFaits = tableDeFaits;
	}
	
}