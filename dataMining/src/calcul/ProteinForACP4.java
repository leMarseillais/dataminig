package calcul;

import model.TableDeFait;

public class ProteinForACP4 extends Protein {

    public ProteinForACP4(TableDeFait tableDeFait) {
	super(tableDeFait);
	// TODO Auto-generated constructor stub
    }

    @Override
    public int compareTo(Object o) {
	if (this.numHelix < ((Protein) o).getNumHelix()) {
	    return -1;
	} else if (this.numHelix == ((Protein) o).getNumHelix()) {
	    return 0;
	}
	return 1;
    }
}
