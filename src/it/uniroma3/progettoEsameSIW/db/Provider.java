package it.uniroma3.progettoEsameSIW.db;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Provider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String vatin;
	private String phoneNumber;
	private String email;
	@ManyToMany(mappedBy = "providers")
	private List<Product> products;
	
	public Provider(String vatin, String phoneNumber, String email) {
		super();
		this.vatin = vatin;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Provider(Long id, String vatin, String phoneNumber, String email,
			List<Product> products) {
		super();
		this.id = id;
		this.vatin = vatin;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.products = products;
	}
}
