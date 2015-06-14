package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.exception.AdministratorNotFoundException;
import it.uniroma3.progettoEsameSIW.exception.InvalidPasswordException;
import it.uniroma3.progettoEsameSIW.model.Administrator;
import it.uniroma3.progettoEsameSIW.model.facade.AdministratorFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.persistence.NoResultException;


@ManagedBean
public class AdministratorController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private String surname;
	private String userId;
	private String password;
	private Administrator administrator;

	@EJB(name="aFacade")
	private AdministratorFacade administratorFacade;

	public String createAdministrator()		{
		this.setAdministrator(administratorFacade.createAdministrator(name, surname, userId, password));
		return "administrator";
	}

	public String checkLogin() throws Exception		{
		try { 
			Administrator a = this.administratorFacade.getAdministratorByUserId(this.userId); 
			a.checkPassword(this.password); 
		}
		catch (NoResultException | InvalidPasswordException | AdministratorNotFoundException  e1 )	{
			return "loginError";

		}
		return "indexAdministrator";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
}
