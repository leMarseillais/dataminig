package services;


import java.util.List;

import model.ModelInterface;


public interface ServicesInerface <T extends ModelInterface, G> {
	public T find(G clef);
	public void save(T objectToSave);
	public void remove(G clef);
	public List<T> findAll();
}
