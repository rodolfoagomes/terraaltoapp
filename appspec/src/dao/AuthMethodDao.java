package dao;

import java.util.List;

import model.AuthMethod;

public class AuthMethodDao extends Dao {

	public AuthMethod byId(int id) {
		em = emf.createEntityManager();
		return em.find(AuthMethod.class, id);
	}

	public void remove(AuthMethod u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();

	}

	public void update(AuthMethod u) {

		em = emf.createEntityManager();
		em.getTransaction().begin();
	
		em.merge(u);
		em.getTransaction().commit();
		em.close();

	}

	public void persist(AuthMethod u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(u);
		em.getTransaction().commit();
		em.close();

	}

	public List<AuthMethod> list() {
		em = emf.createEntityManager();
		return em.createNamedQuery("AuthMethod.findAll",AuthMethod.class).getResultList();
	}
	

	

}
