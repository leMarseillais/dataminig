package calcul;

import model.TableDeFait;

public class Protein implements Comparable {

    protected int typeProtein;
    protected int numHelix;
    protected int numSheet;
    protected int numTurn;
    protected int numTransmembrane;
    protected int numIntermembrane;
    protected int hydrophobicity;
    protected TableDeFait tableDeFait;

    public Protein(TableDeFait tableDeFait) {
	this.tableDeFait = tableDeFait;
	this.hydrophobicity = this.tableDeFait.getComposition()
		.getHidrophobocity();
	this.numHelix = this.tableDeFait.getSequenceAnnotation().getHelix();
	this.numSheet = this.tableDeFait.getSequenceAnnotation()
		.getBetaStrand();
	this.numTurn = this.tableDeFait.getSequenceAnnotation().getTurn();
	this.numTransmembrane = this.tableDeFait.getSequenceAnnotation()
		.getTransmembrane();
	this.numIntermembrane = this.tableDeFait.getSequenceAnnotation()
		.getIntermembrane();
    }

    public int getTypeProtein() {
	return typeProtein;
    }

    public int getNumHelix() {
	return numHelix;
    }

    public int getNumSheet() {
	return numSheet;
    }

    public int getNumTurn() {
	return numTurn;
    }

    public int getNumTransmembrane() {
	return numTransmembrane;
    }

    public int getNumIntermembrane() {
	return numIntermembrane;
    }

    public int getHydrophobicity() {
	return hydrophobicity;
    }

    public void setTypeProtein(int typeProtein) {
	this.typeProtein = typeProtein;
    }

    @Override
    public int compareTo(Object o) {
	if (this.hydrophobicity < ((Protein) o).hydrophobicity) {
	    return -1;
	} else if (this.hydrophobicity == ((Protein) o).hydrophobicity) {
	    return 0;
	}
	return 1;
    }
}
