package it.uniroma3.progettoEsameSIW.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless(name = "aFacade")
public class AdministratorFacade {

	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	public Administrator createAdministrator(String name, String surname, String userId,
			String password)	{
		Administrator administrator = new Administrator(name, surname, userId, password);
		this.em.persist(administrator);
		return administrator;
	}

	public Administrator getAdministrator(Long id)	{
		Administrator administrator = this.em.find(Administrator.class, id);
		return administrator;
	}

	public Administrator getAdministratorByUserId(String userId) throws Exception	{
		List<Administrator> administrators = this.getAdministrators();
		for (Administrator a : administrators)	{
			if (a.getUserId().equals(userId))
				return a;
		}
		throw new AdministratorNotFoundException();
	}

	private List<Administrator> getAdministrators() {
		Query query = this.em.createQuery("SELECT a FROM Administrator a");
		List<Administrator> administrators = query.getResultList();
		return administrators;
	}

}
