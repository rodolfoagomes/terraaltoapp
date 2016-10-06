package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DATA_CLASSIFICATION database table.
 * 
 */
@Entity
@Table(name="DATA_CLASSIFICATION")
@NamedQuery(name="DataClassification.findAll", query="SELECT d FROM DataClassification d")
public class DataClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	//bi-directional many-to-one association to App
	@OneToMany(mappedBy="dataClassification")
	private List<App> apps;

	public DataClassification() {
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

	public List<App> getApps() {
		return this.apps;
	}

	public void setApps(List<App> apps) {
		this.apps = apps;
	}

	public App addApp(App app) {
		getApps().add(app);
		app.setDataClassification(this);

		return app;
	}

	public App removeApp(App app) {
		getApps().remove(app);
		app.setDataClassification(null);

		return app;
	}

	
	@Override
	public String toString() {
		return description;
	}
	
}