package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

 
/**
 * The persistent class for the APP database table.
 * 
 */
@Entity
@NamedQuery(name="App.findAll", query="SELECT a FROM App a")
public class App implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String environments;

	private String name;

	private String purpose;

	private int status;

	//bi-directional many-to-one association to AppClassification
	@ManyToOne
	@JoinColumn(name="id_app_classification")
	private AppClassification appClassification;

	//bi-directional many-to-one association to AuthMethod
	@ManyToOne
	@JoinColumn(name="id_auth_method")
	private AuthMethod authMethod;

	//bi-directional many-to-one association to DataClassification
	@ManyToOne
	@JoinColumn(name="id_data_classification")
	private DataClassification dataClassification;

	public App() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnvironments() {
		return this.environments;
	}

	public void setEnvironments(String environments) {
		this.environments = environments;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public AppClassification getAppClassification() {
		return this.appClassification;
	}

	public void setAppClassification(AppClassification appClassification) {
		this.appClassification = appClassification;
	}

	public AuthMethod getAuthMethod() {
		return this.authMethod;
	}

	public void setAuthMethod(AuthMethod authMethod) {
		this.authMethod = authMethod;
	}

	public DataClassification getDataClassification() {
		return this.dataClassification;
	}

	public void setDataClassification(DataClassification dataClassification) {
		this.dataClassification = dataClassification;
	}

}