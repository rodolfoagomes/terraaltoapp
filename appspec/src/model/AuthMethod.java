package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AUTH_METHOD database table.
 * 
 */
@Entity
@Table(name="AUTH_METHOD")
@NamedQuery(name="AuthMethod.findAll", query="SELECT a FROM AuthMethod a")
public class AuthMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	

	//bi-directional many-to-one association to App
	@OneToMany(mappedBy="authMethod")
	private List<App> apps;

	public AuthMethod() {
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
		app.setAuthMethod(this);

		return app;
	}

	public App removeApp(App app) {
		getApps().remove(app);
		app.setAuthMethod(null);

		return app;
	}
	
	@Override
	public String toString() {
		return description;
	}

}