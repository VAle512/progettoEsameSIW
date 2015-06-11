package it.uniroma3.progettoEsameSIW.model;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;


@Stateless(name = "oFacade")
public class OrderFacade {

	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	public Order createOrder(Date openDate, Long customerId){
		Customer c = this.em.find(Customer.class, customerId);
		Order o = new Order(openDate,c);
		this.em.persist(o);
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
		Customer c = this.em.find(Customer.class,id);
		return c.getOrders();
	}

}