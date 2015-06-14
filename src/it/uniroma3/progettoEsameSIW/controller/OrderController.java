package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.model.Customer;
import it.uniroma3.progettoEsameSIW.model.Order;
import it.uniroma3.progettoEsameSIW.model.OrderLine;
import it.uniroma3.progettoEsameSIW.model.Product;
import it.uniroma3.progettoEsameSIW.model.facade.CustomerFacade;
import it.uniroma3.progettoEsameSIW.model.facade.OrderFacade;
import it.uniroma3.progettoEsameSIW.model.facade.ProductFacade;

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
	private List<Product> products;
	private Product product;
	private Double orderTot;
	private List<Order> orders;

	@EJB(name="oFacade")
	private OrderFacade orderFacade;

	@EJB(name = "pFacade")
	private ProductFacade productFacade;

	@EJB(name="cFacade")
	private CustomerFacade f;


	public String createOrder() {
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		this.setProducts(productFacade.getAllProducts());
		Long customerId = this.retriveCurrentUserId();
		Order newOrder = this.orderFacade.createOrder(new Date(), customerId);
		request.getSession().setAttribute("newOrderId", newOrder.getId());
		return "newOrder";
	}

	public String findOrder() {
		this.setOrder(this.orderFacade.getOrder(this.id));
		this.setOrderTot(this.evaluateOrderTotal(this.order));
		return "orderDetails";
	}

	public String listOrders() {
		Long customerId = this.retriveCurrentUserId();
		this.setOrders(this.orderFacade.getCustomerOrders(customerId));
		return "customerOrders";
	}

	public String orderRecap(){
		Long orderId = retriveNewOrderId();
		Order o = this.orderFacade.getOrder(orderId);
		this.orderTot = this.evaluateOrderTotal(o);
		this.setOrder(o);
		return "orderRecap";
	}

	public String closeOrder(){
		Long orderId = retriveNewOrderId();
		this.orderFacade.closeOrder(orderId);
		return "indexNoLogin";
	}

	private Long retriveNewOrderId(){
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		return (Long)request.getSession().getAttribute("newOrderId");
	}

	private Double evaluateOrderTotal(Order o) {
		Double total = new Double(0);
		for(OrderLine ol:o.getOrderLines())
			total = total + (ol.getUnitPrice()*ol.getQuantity());
		return total;
	}

	private Long retriveCurrentUserId(){
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		return (Long)request.getSession().getAttribute("currentUserId");
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getOrderTot() {
		return orderTot;
	}

	public void setOrderTot(Double orderTot) {
		this.orderTot = orderTot;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}