package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * The persistent class for the composition database table.
 * 
 */
@Entity
public class Composition implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_composition")
    private Integer idComposition;

    private Integer a;

    private Integer c;

    private Integer d;

    private Integer e;

    private Integer f;

    private Integer g;

    private Integer h;

    private Integer i;

    private Integer k;

    private Integer l;

    private Integer m;

    private Integer n;

    private Integer p;

    private Integer q;

    private Integer r;

    private Integer s;

    private Integer t;

    private Integer v;

    private Integer w;

    private Integer y;

    // bi-directional many-to-one association to TableDeFait
    @OneToMany(mappedBy = "composition")
    private Set<TableDeFait> tableDeFaits;

    public Composition() {
    }

    public Integer getIdComposition() {
	return this.idComposition;
    }

    public void setIdComposition(Integer idComposition) {
	this.idComposition = idComposition;
    }

    public Integer getA() {
	return this.a;
    }

    public void setA(Integer a) {
	this.a = a;
    }

    public Integer getC() {
	return this.c;
    }

    public void setC(Integer c) {
	this.c = c;
    }

    public Integer getD() {
	return this.d;
    }

    public void setD(Integer d) {
	this.d = d;
    }

    public Integer getE() {
	return this.e;
    }

    public void setE(Integer e) {
	this.e = e;
    }

    public Integer getF() {
	return this.f;
    }

    public void setF(Integer f) {
	this.f = f;
    }

    public Integer getG() {
	return this.g;
    }

    public void setG(Integer g) {
	this.g = g;
    }

    public Integer getH() {
	return this.h;
    }

    public void setH(Integer h) {
	this.h = h;
    }

    public Integer getI() {
	return this.i;
    }

    public void setI(Integer i) {
	this.i = i;
    }

    public Integer getK() {
	return this.k;
    }

    public void setK(Integer k) {
	this.k = k;
    }

    public Integer getL() {
	return this.l;
    }

    public void setL(Integer l) {
	this.l = l;
    }

    public Integer getM() {
	return this.m;
    }

    public void setM(Integer m) {
	this.m = m;
    }

    public Integer getN() {
	return this.n;
    }

    public void setN(Integer n) {
	this.n = n;
    }

    public Integer getP() {
	return this.p;
    }

    public void setP(Integer p) {
	this.p = p;
    }

    public Integer getQ() {
	return this.q;
    }

    public void setQ(Integer q) {
	this.q = q;
    }

    public Integer getR() {
	return this.r;
    }

    public void setR(Integer r) {
	this.r = r;
    }

    public Integer getS() {
	return this.s;
    }

    public void setS(Integer s) {
	this.s = s;
    }

    public Integer getT() {
	return this.t;
    }

    public void setT(Integer t) {
	this.t = t;
    }

    public Integer getV() {
	return this.v;
    }

    public void setV(Integer v) {
	this.v = v;
    }

    public Integer getW() {
	return this.w;
    }

    public void setW(Integer w) {
	this.w = w;
    }

    public Integer getY() {
	return this.y;
    }

    public void setY(Integer y) {
	this.y = y;
    }

    public Set<TableDeFait> getTableDeFaits() {
	return this.tableDeFaits;
    }

    public void setTableDeFaits(Set<TableDeFait> tableDeFaits) {
	this.tableDeFaits = tableDeFaits;
    }

    public Composition(Integer idComposition, Integer a, Integer c, Integer d,
	    Integer e, Integer f, Integer g, Integer h, Integer i, Integer k,
	    Integer l, Integer m, Integer n, Integer p, Integer q, Integer r,
	    Integer s, Integer t, Integer v, Integer w, Integer y,
	    Set<TableDeFait> tableDeFaits) {
	this.idComposition = idComposition;
	this.a = a;
	this.c = c;
	this.d = d;
	this.e = e;
	this.f = f;
	this.g = g;
	this.h = h;
	this.i = i;
	this.k = k;
	this.l = l;
	this.m = m;
	this.n = n;
	this.p = p;
	this.q = q;
	this.r = r;
	this.s = s;
	this.t = t;
	this.v = v;
	this.w = w;
	this.y = y;
	this.tableDeFaits = tableDeFaits;
    }

    public int getHidrophobocity() {
	int hydophobicity = 0;
	hydophobicity = this.a + this.f + this.g + this.i + this.l + this.m
		+ this.p + this.v + this.w + this.y;
	hydophobicity = hydophobicity * 100 / this.getNumAA();
	return hydophobicity;
    }

    public int getNumAA() {
	return (this.a + this.c + this.d + this.e + this.f + this.g + this.h
		+ this.i + this.k + this.l + this.m + this.n + this.p + this.q
		+ this.r + this.s + this.t + this.v + this.w + this.y);
    }
}