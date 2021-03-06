package it.uniroma3.progettoEsameSIW.model;

import it.uniroma3.progettoEsameSIW.exception.InvalidPasswordException;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String surname;
	private Date birthDate;
	private Date registrationDate;
	@Column(nullable = false, unique = true)
	private String email;
	@OneToMany(mappedBy = "customer",fetch = FetchType.EAGER)
	private List<Order> orders;
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Address address;
	@Column(nullable = false)
	private String password;

	public Customer() {}

	public Customer(String name, String surname, Date birthDate,
			Date registrationDate, Address address, String email, String password) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.registrationDate = registrationDate;
		this.email = email;
		this.address = address;
		this.password = password;
	}


	public Customer checkPassword(String password2) throws InvalidPasswordException {
		if( this.password.equals(password2))
			return this;
		else {
			throw new InvalidPasswordException();
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
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

}
