package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.SequenceAnnotation;

public class SequenceAnnotationService implements ServicesInerface<SequenceAnnotation, Integer> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public SequenceAnnotation find(Integer clef) {
		return (SequenceAnnotation) this.sessionFactory.getCurrentSession().load(SequenceAnnotation.class, clef);
	}

	@Override
	public void save(SequenceAnnotation objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SequenceAnnotation> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Sequence_annotation").list();
	}

}
