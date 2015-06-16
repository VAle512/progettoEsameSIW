package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.model.Address;
import it.uniroma3.progettoEsameSIW.model.Product;
import it.uniroma3.progettoEsameSIW.model.Provider;
import it.uniroma3.progettoEsameSIW.model.facade.ProviderFacade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ProviderController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private String vatin;
	private String phoneNumber;
	private String email;
	private List<Product> products;
	private Address address;
	/*Address fields*/
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	private Provider provider;
	
	@EJB(name = "prFacade")
	private ProviderFacade providerFacade;

	public String createProvider(){
		Address a = new Address(street, city, state, zipcode, country);
		try{
			this.provider = this.providerFacade.createProvider(name, vatin, phoneNumber, email, a);
		}catch(EJBTransactionRolledbackException e){
			return "providerErr";
		}
		return "provider";
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

	public String getVatin() {
		return vatin;
	}

	public void setVatin(String vatin) {
		this.vatin = vatin;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
}