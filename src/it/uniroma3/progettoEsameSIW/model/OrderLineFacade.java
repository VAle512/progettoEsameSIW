package it.uniroma3.progettoEsameSIW.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "oLFacade")
public class OrderLineFacade {
	
	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;
	
	public OrderLine createOrderLine(Double unitPrice, Integer quantity, Long productId, Long orderId)	{
		Order o = this.em.find(Order.class, orderId);
		Product p = this.em.find(Product.class, productId);
		OrderLine ol = new OrderLine(unitPrice, quantity, p);
		o.getOrderLines().add(ol);
		this.em.persist(ol);
		return ol;	
	}
	
	public OrderLine getOrderLine(Long id)	{
		OrderLine ol = this.em.find(OrderLine.class, id);
		return ol;
	}
	
	public void deleteOrderLine(Long id)		{
		OrderLine ol = this.em.find(OrderLine.class, id);
		this.em.remove(ol);
	}
	
	public void updateOrderLine(OrderLine ol)	{
		this.em.merge(ol);
	}

}
