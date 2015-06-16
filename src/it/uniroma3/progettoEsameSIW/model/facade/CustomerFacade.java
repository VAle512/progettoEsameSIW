package it.uniroma3.progettoEsameSIW.model.facade;

import it.uniroma3.progettoEsameSIW.exception.CustomerNotFoundException;
import it.uniroma3.progettoEsameSIW.model.Address;
import it.uniroma3.progettoEsameSIW.model.Customer;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="cFacade")
public class CustomerFacade {

	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	public Customer createCustomer(String name, String surname, Date birthDate,
			Date registrationDate, Address address, String email, String userId, String password)	{

		Customer c = new Customer(name, surname, birthDate, registrationDate, address, email, password);
		this.em.persist(c);
		return c;
	}

	public Customer getCustomer(Long id)	{
		Customer c = this.em.find(Customer.class, id);
		return c;
	}
	
	public Customer getCustomerByEmail(String emailN) throws Exception	{
		List<Customer> customers = this.getCustomers();
		for (Customer c : customers)	{
			if (c.getEmail().equals(emailN))
				return c;
			}
		throw new CustomerNotFoundException();
	}
	
	public List<Customer> getCustomers() 	{
		Query query = this.em.createQuery("SELECT c FROM Customer c");
		List<Customer> customers = query.getResultList();
		return customers;
	}
}  
