package services;


import java.util.List;

import model.Composition;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class CompositionService implements ServicesInerface<Composition, Integer> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Composition find(Integer clef) {
		return (Composition) this.sessionFactory.getCurrentSession().load(Composition.class,  clef);
	}

	@Override
	public void save(Composition objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Composition> findAll() {
		return (List<Composition>) this.sessionFactory.getCurrentSession().createQuery("from Composition").list();
	}
	
	

}
