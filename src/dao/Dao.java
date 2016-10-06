package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author rodolfoagomes
 *
 * @param <T>
 */
public class Dao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("appspec");
	EntityManager em = null;

}
