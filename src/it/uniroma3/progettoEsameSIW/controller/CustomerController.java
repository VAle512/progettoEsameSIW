package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.model.Address;
import it.uniroma3.progettoEsameSIW.model.Customer;
import it.uniroma3.progettoEsameSIW.model.CustomerFacade;
import it.uniroma3.progettoEsameSIW.model.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class CustomerController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private String surname;
	private String birthDate;
	private Date registrationDate;
	private String email;
	private List<Order> orders;
	private Address address;
	private String userId;
	private String password;
	/*Address fields*/
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
	@EJB(name="cFacade")
	private CustomerFacade customerFacade;
	
	public String CreateCustomer(){
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyy");
		Date birthDate = null;
		try {
			birthDate = format.parse(this.birthDate);
		} catch (ParseException e) {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage("registrationForm:birthDate", new FacesMessage("Date format must be the following dd/mm/yyyy"));
			return null;
		}
		Address address = new Address(street, city, state, zipcode, country);
		Customer c = this.customerFacade.createCustomer(name, surname, birthDate, new Date(), address, email, userId, password);
		HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		request.getSession().setAttribute("currentUser",c);
		return "index";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerFacade getCustomerFacade() {
		return customerFacade;
	}

	public void setCustomerFacade(CustomerFacade customerFacade) {
		this.customerFacade = customerFacade;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}