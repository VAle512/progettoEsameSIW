package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.model.Customer;
import it.uniroma3.progettoEsameSIW.model.CustomerFacade;
import it.uniroma3.progettoEsameSIW.model.Order;
import it.uniroma3.progettoEsameSIW.model.OrderFacade;
import it.uniroma3.progettoEsameSIW.model.OrderLine;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
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
	@EJB(name="cFacade")
	private CustomerFacade f;

	public String createOrder() {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		/*TODO
		 * non inserisce customer, per ora settato a null
		 * DA RISOLVERE!
		 */
		//Customer c = (Customer)request.getSession().getAttribute("currentUser");
		//Customer c = (Customer)request.getAttribute("currentUser");
		Order newOrder = new Order(new Date(), null);
		request.getSession().setAttribute("newOrder", newOrder);
		return "newOrder";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Date getEvasionDate() {
		return evasionDate;
	}

	public void setEvasionDate(Date evasionDate) {
		this.evasionDate = evasionDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public OrderFacade getOrderFacade() {
		return orderFacade;
	}

	public void setOrderFacade(OrderFacade orderFacade) {
		this.orderFacade = orderFacade;
	}

}
