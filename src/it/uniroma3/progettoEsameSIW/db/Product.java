package it.uniroma3.progettoEsameSIW.db;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String code;
	private String description;
	private Double price;
	private Integer storageQuantity;
	@ManyToMany
	private List<Provider> providers;
	
	public Product(String name, String code, String description, Double price,
			Integer storageQuantity) {
		super();
		this.name = name;
		this.code = code;
		this.description = description;
		this.price = price;
		this.storageQuantity = storageQuantity;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStorageQuantity() {
		return storageQuantity;
	}

	public void setStorageQuantity(Integer storageQuantity) {
		this.storageQuantity = storageQuantity;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}
	
}