package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.model.OrderLine;
import it.uniroma3.progettoEsameSIW.model.OrderLineFacade;
import it.uniroma3.progettoEsameSIW.model.Product;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class OrderLineController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private Double unitPrice;
	private Integer quantity;
	private Product product;
	private OrderLine orderLine;
	
	
	@EJB(name= "oLFacade")
	private OrderLineFacade orderLineFacade;
	
	
	public String createOrderLine() {
		this.orderLine = orderLineFacade.createOrderLine(unitPrice, quantity, product);
		return "orderLine"; 
	}
	
	public String findOrderLine(Long id) {
		this.orderLine = orderLineFacade.getOrderLine(id);
		return "orderLine";
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}
	
}
