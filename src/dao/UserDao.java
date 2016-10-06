package dao;

import java.util.List;

import model.User;

public class UserDao extends Dao {

	public User byId(int id) {
		em = emf.createEntityManager();
		return em.find(User.class, id);
	}

	public User byLoginAndPAssword(String login, String password) {
		em = emf.createEntityManager();
		User u = null;
		try {
			u = em.createNamedQuery("User.findByLoginAndPassword", User.class).setParameter("login", login)
					.setParameter("password", password).getSingleResult();
		} catch (Exception e) {
			System.out.println("User or Password invalid!!!");
		}
		return u;
	}

	public void remove(User u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();

	}

	public void update(User u) {

		em = emf.createEntityManager();
		em.getTransaction().begin();
	
		em.merge(u);
		em.getTransaction().commit();
		em.close();

	}

	public void persist(User u) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(u);
		em.getTransaction().commit();
		em.close();

	}

	public List<User> list() {
		em = emf.createEntityManager();
		return em.createNamedQuery("User.findAll",User.class).getResultList();
	}
	
	public User byLogin(String login) {
		em = emf.createEntityManager();
		return em.createNamedQuery("User.findByLogin",User.class).setParameter("login", login).getSingleResult();
	}
	
	

}
