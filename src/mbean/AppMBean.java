package mbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import dao.AppClassificationDao;
import dao.AppDao;
import dao.AuthMethodDao;
import dao.DataClassificationDao;
import model.App;
import model.AppClassification;
import model.AuthMethod;
import model.DataClassification;

@ManagedBean
@SessionScoped
public class AppMBean {

	
	AppClassificationDao appClassDao = new AppClassificationDao();
	DataClassificationDao dataClassDao = new DataClassificationDao();
	AuthMethodDao authMethodDao = new AuthMethodDao();
	
	AppDao dao = new AppDao();
	App app = new App();
	
	AppClassification appClassification = new AppClassification();
	DataClassification dataClassification = new DataClassification();
	AuthMethod authMethod = new AuthMethod();

	List<AppClassification> appClassifications = new ArrayList<AppClassification>();
	List<DataClassification> dataClassifications = new ArrayList<DataClassification>();
	List<AuthMethod> authMethods = new ArrayList<AuthMethod>();
	
	public AppMBean(){
		authMethods = authMethodDao.list();
		dataClassifications = dataClassDao.list();
		appClassifications = appClassDao.list();
		System.out.println("Running....");
	}
	
	
	public String editAction() {

		return "app.xhtml";
	}


	public void preparAdd(ActionEvent event) {
/*
		oldApp = app;
		oldApp.setStatus(0);

		app = new App();
		User u = (User) SessionControl.getSessionAttribute(Constants.USER_LOGGED);

		app.setAgent(u.getLogin());
		app.setDateAgentSave(new Date());
		app.setStudio(studio);*/
	}

	public void save(ActionEvent event) {
	/*	User u = (User) SessionControl.getSessionAttribute(Constants.USER_LOGGED);

		app.setAgent(u.getLogin());
		app.setDateAgentSave(new Date());
		app.setStatus(1);
		dao.update(app);

		if (oldApp != null)
			dao.update(oldApp);*/

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "App", "Request saved!");
		FacesContext.getCurrentInstance().addMessage(null, msg);

	}

	public AppDao getDao() {
		return dao;
	}

	public void setDao(AppDao dao) {
		this.dao = dao;
	}

	public App getApp() {
		return app;
	}

	public void setApp(App customer) {
		this.app = customer;
	}


	public List<AppClassification> getAppClassifications() {
		return appClassifications;
	}


	public void setAppClassifications(List<AppClassification> appClassifications) {
		this.appClassifications = appClassifications;
	}


	public List<DataClassification> getDataClassifications() {
		return dataClassifications;
	}


	public void setDataClassifications(List<DataClassification> dataClassifications) {
		this.dataClassifications = dataClassifications;
	}


	public List<AuthMethod> getAuthMethods() {
		return authMethods;
	}


	public void setAuthMethods(List<AuthMethod> authMethods) {
		this.authMethods = authMethods;
	}


	public AppClassification getAppClassification() {
		return appClassification;
	}


	public void setAppClassification(AppClassification appClassification) {
		this.appClassification = appClassification;
	}


	public DataClassification getDataClassification() {
		return dataClassification;
	}


	public void setDataClassification(DataClassification dataClassification) {
		this.dataClassification = dataClassification;
	}


	public AuthMethod getAuthMethod() {
		return authMethod;
	}


	public void setAuthMethod(AuthMethod authMethod) {
		this.authMethod = authMethod;
	}


	public AppClassificationDao getAppClassDao() {
		return appClassDao;
	}


	public DataClassificationDao getDataClassDao() {
		return dataClassDao;
	}


	public AuthMethodDao getAuthMethodDao() {
		return authMethodDao;
	}


	public void setAppClassDao(AppClassificationDao appClassDao) {
		this.appClassDao = appClassDao;
	}


	public void setDataClassDao(DataClassificationDao dataClassDao) {
		this.dataClassDao = dataClassDao;
	}


	public void setAuthMethodDao(AuthMethodDao authMethodDao) {
		this.authMethodDao = authMethodDao;
	}

	
}
