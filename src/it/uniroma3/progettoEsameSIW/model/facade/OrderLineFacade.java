package it.uniroma3.progettoEsameSIW.model.facade;

import it.uniroma3.progettoEsameSIW.exception.InvalidQuantityException;
import it.uniroma3.progettoEsameSIW.model.Order;
import it.uniroma3.progettoEsameSIW.model.OrderLine;
import it.uniroma3.progettoEsameSIW.model.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "oLFacade")
public class OrderLineFacade {
	
	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;
	
	public OrderLine createOrderLine(Double unitPrice, Integer quantity, Long productId, Long orderId) throws InvalidQuantityException	{
		Order o = this.em.find(Order.class, orderId);
		Product p = this.em.find(Product.class, productId);
		if(p.getStorageQuantity() < quantity)
			throw new InvalidQuantityException();
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
