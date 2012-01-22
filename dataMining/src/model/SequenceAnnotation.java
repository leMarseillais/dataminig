package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the sequence_annotation database table.
 * 
 */
@Entity
@Table(name = "sequence_annotation")
public class SequenceAnnotation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_seq_annotation")
    private Integer idSeqAnnotation;

    @Column(name = "beta_strand")
    private Integer betaStrand;

    private Integer helix;

    private Integer intermembrane;

    private Integer transmembrane;

    private Integer turn;

    // bi-directional many-to-one association to TableDeFait
    @OneToMany(mappedBy = "sequenceAnnotation")
    private Set<TableDeFait> tableDeFaits;

    public SequenceAnnotation() {
    }

    public Integer getIdSeqAnnotation() {
	return this.idSeqAnnotation;
    }

    public void setIdSeqAnnotation(Integer idSeqAnnotation) {
	this.idSeqAnnotation = idSeqAnnotation;
    }

    public Integer getBetaStrand() {
	return this.betaStrand;
    }

    public void setBetaStrand(Integer betaStrand) {
	this.betaStrand = betaStrand;
    }

    public Integer getHelix() {
	return this.helix;
    }

    public void setHelix(Integer helix) {
	this.helix = helix;
    }

    public Integer getIntermembrane() {
	return this.intermembrane;
    }

    public void setIntermembrane(Integer intermembrane) {
	this.intermembrane = intermembrane;
    }

    public Integer getTransmembrane() {
	return this.transmembrane;
    }

    public void setTransmembrane(Integer transmembrane) {
	this.transmembrane = transmembrane;
    }

    public Integer getTurn() {
	return this.turn;
    }

    public void setTurn(Integer turn) {
	this.turn = turn;
    }

    public Set<TableDeFait> getTableDeFaits() {
	return this.tableDeFaits;
    }

    public void setTableDeFaits(Set<TableDeFait> tableDeFaits) {
	this.tableDeFaits = tableDeFaits;
    }

    public SequenceAnnotation(Integer idSeqAnnotation, Integer betaStrand,
	    Integer helix, Integer intermembrane, Integer transmembrane,
	    Integer turn, Set<TableDeFait> tableDeFaits) {
	this.idSeqAnnotation = idSeqAnnotation;
	this.betaStrand = betaStrand;
	this.helix = helix;
	this.intermembrane = intermembrane;
	this.transmembrane = transmembrane;
	this.turn = turn;
	this.tableDeFaits = tableDeFaits;
    }

}