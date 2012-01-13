package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.GeneralAnnotation;

@Service("GeneralAnnnotationService")
@Transactional
public class GeneralAnnnotationService implements
		ServicesInerface<GeneralAnnotation, Integer> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public GeneralAnnotation find(Integer clef) {
		return (GeneralAnnotation) this.sessionFactory.getCurrentSession().load(GeneralAnnotation.class, clef);
	}

	@Override
	public void save(GeneralAnnotation objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GeneralAnnotation> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from General_annotation").list();
	}

}
