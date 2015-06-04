package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.model.Customer;
import it.uniroma3.progettoEsameSIW.model.Order;
import it.uniroma3.progettoEsameSIW.model.OrderFacade;
import it.uniroma3.progettoEsameSIW.model.OrderLine;
import it.uniroma3.progettoEsameSIW.model.Product;
import it.uniroma3.progettoEsameSIW.model.ProductFacade;

import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class OrderController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private Date openDate;
	private Date closeDate;
	private Date evasionDate;
	private Customer customer;
	private Order order;
	private List<OrderLine> orderLines;
	private Integer status;
	
	@EJB(name="oFacade")
	private OrderFacade orderFacade;
	
	public String createOrder() {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		this.order = orderFacade.createOrder(new Date(), customer);
		return null;
	
}
}