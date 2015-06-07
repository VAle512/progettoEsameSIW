package it.uniroma3.progettoEsameSIW.model;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless(name = "oFacade")
public class OrderFacade {

	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	public Order createOrder(Date openDate, Customer customer){
		Order o = new Order(openDate, customer);
		this.em.persist(o);
		return o;
	}
	
	public void persistOrder(Order newOrder, Long userId) {
		Customer c = this.em.find(Customer.class, userId);
		newOrder.setCustomer(c);
		this.em.persist(newOrder);
	}
	
}
