package dao;

import java.util.List;

import model.App;

public class AppDao extends Dao {

	public App byId(int id) {
		em = emf.createEntityManager();
		return em.find(App.class, id);
	}

	public void remove(App u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();

	}

	public void update(App u) {

		em = emf.createEntityManager();
		em.getTransaction().begin();
	
		em.merge(u);
		em.getTransaction().commit();
		em.close();

	}

	public void persist(App u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(u);
		em.getTransaction().commit();
		em.close();

	}

	public List<App> list() {
		em = emf.createEntityManager();
		return em.createNamedQuery("dataClassification.findAll",App.class).getResultList();
	}
	

	

}
