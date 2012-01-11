package src.parsing;

import java.util.HashSet;
import java.util.Iterator;

import org.biojava.bio.seq.Feature;
import org.biojavax.bio.seq.RichSequence;

public class ExtractDomains {
	
	private int idDomain;
	private String name;
	private RichSequence genBank;
	
	public ExtractDomains(RichSequence sequence) {
		super();
		this.genBank = sequence;
	}

	public int getIdDomain() {
		return idDomain;
	}

	public String getName() {
		return name;
	}
	
	
	
}
