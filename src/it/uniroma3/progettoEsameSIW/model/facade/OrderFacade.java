package it.uniroma3.progettoEsameSIW.model.facade;

import it.uniroma3.progettoEsameSIW.model.Customer;
import it.uniroma3.progettoEsameSIW.model.Order;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "oFacade")
public class OrderFacade {

	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	public Order createOrder(Date openDate, Long customerId){
		Customer c = this.em.find(Customer.class, customerId);
		Order o = new Order(openDate,c);
		this.em.persist(o);
		c.getOrders().add(o);
		this.em.merge(c);
		return o;
	}

	public Order getOrder(Long id){
		Order o = this.em.find(Order.class, id);
		return o;
	}

	public void closeOrder(Long id) {
		Order o = this.em.find(Order.class, id);
		o.setStatus(new Integer(2));
		o.setCloseDate(new Date());
		this.em.merge(o);
	}

	public List<Order> getCustomerOrders(Long id) {
		Query q = this.em.createQuery("SELECT o FROM Order o WHERE o.customer.id = :id");
		q.setParameter("id",id);
		List<Order> l = q.getResultList();
		return l;
	}
}