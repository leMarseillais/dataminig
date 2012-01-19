package calcul;

import model.TableDeFait;

public class Protein {

    private int typeProtein;
    private int numHelix;
    private int numSheet;
    private int numTurn;
    private int numTransmembrane;
    private int numIntermembrane;
    private TableDeFait tableDeFait;

    public Protein(int typeProtein, TableDeFait tableDeFait) {
	this.typeProtein = typeProtein;
	this.tableDeFait = tableDeFait;
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

}
