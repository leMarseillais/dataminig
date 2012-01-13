package parsing;

import org.biojavax.bio.seq.RichSequence;

public class ExtractComposition {

	private RichSequence genBank;
	private String sequence;
	private Short a=0;
	private Short c=0;
	private Short d=0;
	private Short e=0;
	private Short f=0;
	private Short g=0;
	private Short h=0;
	private Short i=0;
	private Short k=0;
	private Short l=0;
	private Short m=0;
	private Short n=0;
	private Short p=0;
	private Short q=0;
	private Short r=0;
	private Short s=0;
	private Short t=0;
	private Short v=0;
	private Short w=0;
	private Short y=0;

	public ExtractComposition(RichSequence sequence) {
		this.genBank = sequence;
		extractInfo();
		System.out.println(this);
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
		this.a = (short) ((this.a* 100) / this.sequence.length());
		this.c = (short) ((this.c* 100) / this.sequence.length());
		this.d = (short) ((this.d* 100) / this.sequence.length());
		this.e = (short) ((this.e* 100) / this.sequence.length());
		this.f = (short) ((this.f* 100) / this.sequence.length());
		this.g = (short) ((this.g* 100) / this.sequence.length());
		this.i = (short) ((this.i* 100) / this.sequence.length());
		this.k = (short) ((this.k* 100) / this.sequence.length());
		this.l = (short) ((this.l* 100) / this.sequence.length());
		this.m = (short) ((this.m* 100)/ this.sequence.length());
		this.p = (short) ((this.p* 100) / this.sequence.length());
		this.q = (short) ((this.q* 100) / this.sequence.length());
		this.r = (short) ((this.r* 100) / this.sequence.length());
		this.s = (short) ((this.s* 100) / this.sequence.length());
		this.t = (short) ((this.t* 100) / this.sequence.length());
		this.v = (short) ((this.v* 100) / this.sequence.length());
		this.w = (short) ((this.w* 100) / this.sequence.length());
		this.y = (short) ((this.y* 100) / this.sequence.length());

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
