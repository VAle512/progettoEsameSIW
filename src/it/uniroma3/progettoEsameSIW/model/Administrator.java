package it.uniroma3.progettoEsameSIW.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Administrator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String surname;
	@Column(nullable = false)
	private String userId;
	@Column(nullable = false)
	private String password;
	
	
	public Administrator(String name, String surname, String userId,
			String password) {
		this.name = name;
		this.surname = surname;
		this.userId = userId;
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
	
	
	public Administrator checkPassword(String password2) throws InvalidPasswordException {
		if( this.password.equals(password2))
			return this;
		else {
			throw new InvalidPasswordException();
		}
	}


}
