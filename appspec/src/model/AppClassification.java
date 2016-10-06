package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the APP_CLASSIFICATION database table.
 * 
 */
@Entity
@Table(name="APP_CLASSIFICATION")
@NamedQuery(name="AppClassification.findAll", query="SELECT a FROM AppClassification a")
public class AppClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	public AppClassification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return description;
	}

}