package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Domain;

public class DomainService implements ServicesInerface<Domain, Integer> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Domain find(Integer clef) {
		return (Domain) this.sessionFactory.getCurrentSession().load(Domain.class, clef);
	}

	@Override
	public void save(Domain objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
		
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Domain> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Domain").list();
	}

}
