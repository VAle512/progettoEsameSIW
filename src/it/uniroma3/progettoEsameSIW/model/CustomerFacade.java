package it.uniroma3.progettoEsameSIW.model;

import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name="cFacade")
public class CustomerFacade {
	
	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	
	public Customer createCustomer(String name, String surname, Date birthDate,
			Date registrationDate, Address address, String email, String userId, String password)	{
		
		Customer c = new Customer(name, surname, birthDate, registrationDate, address, email, userId, password);
		this.em.persist(c);
		return c;
	}
	
	public Customer getCustomer(Long id)	{
		Customer c = this.em.find(Customer.class, id);
		return c;
	}
	
/*	public void deleteCustomer(Long id)		{
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Customer c = this.em.find(Customer.class, id);
		this.em.remove(c);
		tx.commit(); 
		this.close();
		}
	
	public void updateCustomer(Customer c)		{
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.merge(c);
		tx.commit();
		this.close();
	} */
}  
