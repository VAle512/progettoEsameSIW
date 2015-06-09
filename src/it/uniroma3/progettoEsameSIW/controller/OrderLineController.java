package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.model.OrderLine;
import it.uniroma3.progettoEsameSIW.model.OrderLineFacade;
import it.uniroma3.progettoEsameSIW.model.Product;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class OrderLineController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private Double unitPrice;
	private Integer quantity;
	private Long productId;
	private OrderLine orderLine;
	
	
	@EJB(name= "oLFacade")
	private OrderLineFacade orderLineFacade;
	
	
	public String createOrderLine() {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Long orderId = (Long)request.getSession().getAttribute("newOrderId");
		//Long orderId = new Long(1001);
		this.orderLine = orderLineFacade.createOrderLine(unitPrice, quantity, productId,orderId);
		return "orderLine"; 
	}
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}
	
}
