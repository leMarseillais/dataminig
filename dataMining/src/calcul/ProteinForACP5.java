package calcul;

import model.TableDeFait;

public class ProteinForACP5 extends Protein {

    public ProteinForACP5(TableDeFait tableDeFait) {
	super(tableDeFait);
    }

    @Override
    public int compareTo(Object o) {
	if (this.numSheet < ((Protein) o).getNumSheet()) {
	    return -1;
	} else if (this.numSheet == ((Protein) o).getNumSheet()) {
	    return 0;
	}
	return 1;
    }

}
