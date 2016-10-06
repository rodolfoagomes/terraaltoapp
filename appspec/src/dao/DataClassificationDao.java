package dao;

import java.util.List;

import model.DataClassification;

public class DataClassificationDao extends Dao {

	public DataClassification byId(int id) {
		em = emf.createEntityManager();
		return em.find(DataClassification.class, id);
	}

	public void remove(DataClassification u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();

	}

	public void update(DataClassification u) {

		em = emf.createEntityManager();
		em.getTransaction().begin();
	
		em.merge(u);
		em.getTransaction().commit();
		em.close();

	}

	public void persist(DataClassification u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(u);
		em.getTransaction().commit();
		em.close();

	}

	public List<DataClassification> list() {
		em = emf.createEntityManager();
		return em.createNamedQuery("DataClassification.findAll",DataClassification.class).getResultList();
	}
	

	

}
