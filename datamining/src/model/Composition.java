package model;

// default package
// Generated 12 janv. 2012 17:41:04 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Composition generated by hbm2java
 */
@Entity
@Table(name = "composition", schema = "public")
public class Composition implements java.io.Serializable, ModelInterface {

	private int idComposition;
	private Short a;
	private Short c;
	private Short d;
	private Short e;
	private Short f;
	private Short g;
	private Short h;
	private Short i;
	private Short k;
	private Short l;
	private Short m;
	private Short n;
	private Short p;
	private Short q;
	private Short r;
	private Short s;
	private Short t;
	private Short v;
	private Short w;
	private Short y;
	private Set<TableDeFait> tableDeFaits = new HashSet<TableDeFait>(0);

	public Composition() {
	}

	public Composition(int idComposition) {
		this.idComposition = idComposition;
	}

	public Composition(int idComposition, Short a, Short c, Short d, Short e,
			Short f, Short g, Short h, Short i, Short k, Short l, Short m,
			Short n, Short p, Short q, Short r, Short s, Short t, Short v,
			Short w, Short y, Set<TableDeFait> tableDeFaits) {
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

	@Id
	@Column(name = "id_composition", unique = true, nullable = false)
	public int getIdComposition() {
		return this.idComposition;
	}

	public void setIdComposition(int idComposition) {
		this.idComposition = idComposition;
	}

	@Column(name = "a")
	public Short getA() {
		return this.a;
	}

	public void setA(Short a) {
		this.a = a;
	}

	@Column(name = "c")
	public Short getC() {
		return this.c;
	}

	public void setC(Short c) {
		this.c = c;
	}

	@Column(name = "d")
	public Short getD() {
		return this.d;
	}

	public void setD(Short d) {
		this.d = d;
	}

	@Column(name = "e")
	public Short getE() {
		return this.e;
	}

	public void setE(Short e) {
		this.e = e;
	}

	@Column(name = "f")
	public Short getF() {
		return this.f;
	}

	public void setF(Short f) {
		this.f = f;
	}

	@Column(name = "g")
	public Short getG() {
		return this.g;
	}

	public void setG(Short g) {
		this.g = g;
	}

	@Column(name = "h")
	public Short getH() {
		return this.h;
	}

	public void setH(Short h) {
		this.h = h;
	}

	@Column(name = "i")
	public Short getI() {
		return this.i;
	}

	public void setI(Short i) {
		this.i = i;
	}

	@Column(name = "k")
	public Short getK() {
		return this.k;
	}

	public void setK(Short k) {
		this.k = k;
	}

	@Column(name = "l")
	public Short getL() {
		return this.l;
	}

	public void setL(Short l) {
		this.l = l;
	}

	@Column(name = "m")
	public Short getM() {
		return this.m;
	}

	public void setM(Short m) {
		this.m = m;
	}

	@Column(name = "n")
	public Short getN() {
		return this.n;
	}

	public void setN(Short n) {
		this.n = n;
	}

	@Column(name = "p")
	public Short getP() {
		return this.p;
	}

	public void setP(Short p) {
		this.p = p;
	}

	@Column(name = "q")
	public Short getQ() {
		return this.q;
	}

	public void setQ(Short q) {
		this.q = q;
	}

	@Column(name = "r")
	public Short getR() {
		return this.r;
	}

	public void setR(Short r) {
		this.r = r;
	}

	@Column(name = "s")
	public Short getS() {
		return this.s;
	}

	public void setS(Short s) {
		this.s = s;
	}

	@Column(name = "t")
	public Short getT() {
		return this.t;
	}

	public void setT(Short t) {
		this.t = t;
	}

	@Column(name = "v")
	public Short getV() {
		return this.v;
	}

	public void setV(Short v) {
		this.v = v;
	}

	@Column(name = "w")
	public Short getW() {
		return this.w;
	}

	public void setW(Short w) {
		this.w = w;
	}

	@Column(name = "y")
	public Short getY() {
		return this.y;
	}

	public void setY(Short y) {
		this.y = y;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "composition")
	public Set<TableDeFait> getTableDeFaits() {
		return this.tableDeFaits;
	}

	public void setTableDeFaits(Set<TableDeFait> tableDeFaits) {
		this.tableDeFaits = tableDeFaits;
	}

}
