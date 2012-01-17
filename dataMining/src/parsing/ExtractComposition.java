package parsing;

import java.util.HashSet;
import java.util.Set;

import model.Composition;
import model.TableDeFait;

import org.biojavax.bio.seq.RichSequence;

public class ExtractComposition {

	private Composition composition;
	private int idComposition=0;
	private RichSequence genBank;
	private String sequence;
	private Integer a=0;
	private Integer c=0;
	private Integer d=0;
	private Integer e=0;
	private Integer f=0;
	private Integer g=0;
	private Integer h=0;
	private Integer i=0;
	private Integer k=0;
	private Integer l=0;
	private Integer m=0;
	private Integer n=0;
	private Integer p=0;
	private Integer q=0;
	private Integer r=0;
	private Integer s=0;
	private Integer t=0;
	private Integer v=0;
	private Integer w=0;
	private Integer y=0;
	private Set<TableDeFait> tableDeFaits= new HashSet<TableDeFait>();

	public ExtractComposition(int count, RichSequence sequence, TableDeFait tableDeFait) {
		this.genBank = sequence;
		extractInfo();
		this.idComposition=count;
		tableDeFaits.add(tableDeFait);
		this.composition=new Composition(idComposition, a, c, d, e, f, g, h, i, k, l, m, n, p, q, r, s, t, v, w, y, tableDeFaits);
		System.out.println("idComposition = "+this.idComposition);
	}

	public int getIdComposition() {
		return idComposition;
	}

	

	public Composition getComposition() {
		return composition;
	}

	public void extractInfo() {
		this.sequence = this.genBank.seqString();
		for (int i = 0; i < this.sequence.length(); i++) {
			char aa = this.sequence.charAt(i);
			if (aa == 'A') {
				this.a++;
			}
			if (aa == 'C') {
				this.c++;
			}
			if (aa == 'D') {
				this.d++;
			}
			if (aa == 'E') {
				this.e++;
			}
			if (aa == 'F') {
				this.f++;
			}
			if (aa == 'G') {
				this.g++;
			}
			if (aa == 'I') {
				this.i++;
			}
			if (aa == 'K') {
				this.k++;
			}
			if (aa == 'L') {
				this.l++;
			}
			if (aa == 'M') {
				this.m++;
			}
			if (aa == 'P') {
				this.p++;
			}
			if (aa == 'Q') {
				this.q++;
			}
			if (aa == 'R') {
				this.r++;
			}
			if (aa == 'S') {
				this.s++;
			}
			if (aa == 'T') {
				this.t++;
			}
			if (aa == 'V') {
				this.v++;
			}
			if (aa == 'W') {
				this.w++;
			}
			if (aa == 'Y') {
				this.y++;
			}
		}
		this.a = (Integer) ((this.a* 100) / this.sequence.length());
		this.c = (Integer) ((this.c* 100) / this.sequence.length());
		this.d = (Integer) ((this.d* 100) / this.sequence.length());
		this.e = (Integer) ((this.e* 100) / this.sequence.length());
		this.f = (Integer) ((this.f* 100) / this.sequence.length());
		this.g = (Integer) ((this.g* 100) / this.sequence.length());
		this.i = (Integer) ((this.i* 100) / this.sequence.length());
		this.k = (Integer) ((this.k* 100) / this.sequence.length());
		this.l = (Integer) ((this.l* 100) / this.sequence.length());
		this.m = (Integer) ((this.m* 100)/ this.sequence.length());
		this.p = (Integer) ((this.p* 100) / this.sequence.length());
		this.q = (Integer) ((this.q* 100) / this.sequence.length());
		this.r = (Integer) ((this.r* 100) / this.sequence.length());
		this.s = (Integer) ((this.s* 100) / this.sequence.length());
		this.t = (Integer) ((this.t* 100) / this.sequence.length());
		this.v = (Integer) ((this.v* 100) / this.sequence.length());
		this.w = (Integer) ((this.w* 100) / this.sequence.length());
		this.y = (Integer) ((this.y* 100) / this.sequence.length());

	}

	@Override
	public String toString() {
		return "ExtractComposition [sequence=" + sequence + ", a=" + a + ", c="
				+ c + ", d=" + d + ", e=" + e + ", f=" + f + ", g=" + g
				+ ", h=" + h + ", i=" + i + ", k=" + k + ", l=" + l + ", m="
				+ m + ", n=" + n + ", p=" + p + ", q=" + q + ", r=" + r
				+ ", s=" + s + ", t=" + t + ", v=" + v + ", w=" + w + ", y="
				+ y + "]";
	}
}
