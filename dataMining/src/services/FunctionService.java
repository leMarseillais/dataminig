package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Function;

public class FunctionService implements ServicesInerface<Function, Integer> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Function find(Integer clef) {
		return (Function) this.sessionFactory.getCurrentSession().load(Function.class, clef);
	}

	@Override
	public void save(Function objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Function> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from function").list();
	}

}
