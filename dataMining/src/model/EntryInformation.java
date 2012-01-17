package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entry_information database table.
 * 
 */
@Entity
@Table(name="entry_information")
public class EntryInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_entry")
	private Integer idEntry;

	@Column(name="entry_name")
	private String entryName;

	//bi-directional one-to-one association to TableDeFait
	@OneToOne(mappedBy="entryInformation")
	private TableDeFait tableDeFait;

    public EntryInformation() {
    }

	public Integer getIdEntry() {
		return this.idEntry;
	}

	public void setIdEntry(Integer idEntry) {
		this.idEntry = idEntry;
	}

	public String getEntryName() {
		return this.entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

	public TableDeFait getTableDeFait() {
		return this.tableDeFait;
	}

	public void setTableDeFait(TableDeFait tableDeFait) {
		this.tableDeFait = tableDeFait;
	}

	public EntryInformation(Integer idEntry, String entryName,
			TableDeFait tableDeFait) {
		this.idEntry = idEntry;
		this.entryName = entryName;
		this.tableDeFait = tableDeFait;
	}
	
}