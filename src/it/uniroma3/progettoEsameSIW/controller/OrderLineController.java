package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.exception.InvalidQuantityException;
import it.uniroma3.progettoEsameSIW.model.OrderLine;
import it.uniroma3.progettoEsameSIW.model.facade.OrderLineFacade;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class OrderLineController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	@ManagedProperty(value="#{param.unitPrice}")
	private Double unitPrice;
	@ManagedProperty(value="#{param.quantity}")
	private Integer quantity;
	@ManagedProperty(value="#{param.productId}")
	private Long productId;
	private OrderLine orderLine;
	
	
	@EJB(name= "oLFacade")
	private OrderLineFacade orderLineFacade;
	
	
	public String createOrderLine() {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Long orderId = (Long)request.getSession().getAttribute("newOrderId");
		try {
			this.orderLine = orderLineFacade.createOrderLine(unitPrice, quantity, productId, orderId);
		} catch (InvalidQuantityException e) {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage("orderForm:quantity", new FacesMessage("You have selected a quantity for your order bigger than the available. Please try again with a different one!"));
			return null;
		}
		return "productAdded"; 
	}
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String findOrderLine(Long id) {
		this.orderLine = orderLineFacade.getOrderLine(id);
		return null;
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
