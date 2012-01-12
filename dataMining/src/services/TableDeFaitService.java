package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.TableDeFait;

public class TableDeFaitService implements ServicesInerface<TableDeFait, Integer> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public TableDeFait find(Integer clef) {
		return (TableDeFait) this.sessionFactory.getCurrentSession().load(TableDeFait.class, clef);
	}

	@Override
	public void save(TableDeFait objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TableDeFait> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from  table Table_de_fait").list();
	}

}
