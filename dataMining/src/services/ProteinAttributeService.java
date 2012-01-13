package services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.ProteinAttribute;

@Service("ProteinAttributeService")
@Transactional
public class ProteinAttributeService implements ServicesInerface<ProteinAttribute, Integer> {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public ProteinAttribute find(Integer clef) {
		return (ProteinAttribute) this.sessionFactory.getCurrentSession().load(ProteinAttribute.class, clef);
	}

	@Override
	public void save(ProteinAttribute objectToSave) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(objectToSave);
	}

	@Override
	public void remove(Integer clef) {
		this.sessionFactory.getCurrentSession().delete(this.find(clef));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProteinAttribute> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Protein_attribute").list();
	}

}
