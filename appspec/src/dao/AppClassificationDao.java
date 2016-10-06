package dao;

import java.util.List;

import model.AppClassification;

public class AppClassificationDao extends Dao {

	public AppClassification byId(int id) {
		em = emf.createEntityManager();
		return em.find(AppClassification.class, id);
	}

	public void remove(AppClassification u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();

	}

	public void update(AppClassification u) {

		em = emf.createEntityManager();
		em.getTransaction().begin();
	
		em.merge(u);
		em.getTransaction().commit();
		em.close();

	}

	public void persist(AppClassification u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(u);
		em.getTransaction().commit();
		em.close();

	}

	public List<AppClassification> list() {
		em = emf.createEntityManager();
		return em.createNamedQuery("AppClassification.findAll",AppClassification.class).getResultList();
	}
	

	

}
