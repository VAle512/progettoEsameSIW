package it.uniroma3.progettoEsameSIW.model.facade;

import java.util.List;

import it.uniroma3.progettoEsameSIW.exception.ProviderNotFoundException;
import it.uniroma3.progettoEsameSIW.model.Address;
import it.uniroma3.progettoEsameSIW.model.Provider;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "pvFacade")
public class ProviderFacade {

	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	public Provider createProvider(String name, String vatin, String phoneNumber, String email, Address address){
		Provider p = new Provider(name, vatin, phoneNumber, email, address);
		this.em.persist(p);
		return p;
	}

	public Provider findProvider(String vatin) throws ProviderNotFoundException{
		List<Provider> providers = this.getProviders();
		for(Provider p : providers)
			if(p.getVatin().equals(vatin))
				return p;
		throw new ProviderNotFoundException();
	}

	public List<Provider> getProviders(){
		Query q = this.em.createQuery("SELECT p FROM Provider p");
		List<Provider> providers = q.getResultList();
		return providers;
	} 
}