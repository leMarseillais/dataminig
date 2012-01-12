package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.EntryInformation;

public class EntryInformationService implements ServicesInerface<EntryInformation, Integer> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public EntryInformation find(Integer clef) {
		return (EntryInformation) this.sessionFactory.getCurrentSession().load(EntryInformation.class, clef);
	}

	@Override
	public void save(EntryInformation objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EntryInformation> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Entry_Information").list();
	}

}
