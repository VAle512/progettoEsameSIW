package it.uniroma3.progettoEsameSIW.model;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CustomerFacade {
	
	private EntityManagerFactory emf;
	private EntityManager em;

	public CustomerFacade()	{
		this.emf = Persistence.createEntityManagerFactory("dbProgettoSIW-unit");
		this.em = this.emf.createEntityManager();
	}
	
	private void close(){
		this.em.close();
		this.emf.close();
	}
	
	public Customer createCustomer(String name, String surname, Date birthDate,
			Date registrationDate, Address address, String email, String userID, String password)	{
		
		Customer c = new Customer(name, surname, birthDate, registrationDate, address, email, userID, password);
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.persist(c);
		tx.commit();
		this.close();
		return c;
	}
	
	public Customer getCustomer(Long id)	{
		Customer c = this.em.find(Customer.class, id);
		this.close();
		return c;
	}
	
	public void deleteCustomer(Long id)		{
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
	}
}
