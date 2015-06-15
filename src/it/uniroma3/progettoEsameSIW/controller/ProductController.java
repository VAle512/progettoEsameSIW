package it.uniroma3.progettoEsameSIW.controller;

import it.uniroma3.progettoEsameSIW.exception.ProviderNotFoundException;
import it.uniroma3.progettoEsameSIW.model.Product;
import it.uniroma3.progettoEsameSIW.model.Provider;
import it.uniroma3.progettoEsameSIW.model.facade.ProductFacade;
import it.uniroma3.progettoEsameSIW.model.facade.ProviderFacade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ProductController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private String code;
	private String description;
	private Double price;
	private Integer storageQuantity;
	private Product product;
	private List<Product> products;

	private String providerVatin;

	@EJB(name="pFacade")
	private ProductFacade productFacade;
	@EJB(name="pvFacade")
	private ProviderFacade providerFacade;

	public String createProduct(){
		Provider pv;
		try {
			pv = this.providerFacade.findProvider(this.providerVatin);
		} catch (ProviderNotFoundException e) {
			return "missingProvider";
		}
		try{
			this.product = productFacade.createProduct(name, code, description, price, storageQuantity, pv.getId());
		}catch(EJBTransactionRolledbackException e){
			return "productErr";
		}
		return "productConfirmed"; 
	}

	public String getCatalog() {
		this.products = productFacade.getAllProducts();
		return "catalog"; 
	}

	public String findProduct() {
		this.product = productFacade.getProduct(id);
		return "product";
	}

	public String findProduct(Long id) {
		this.product = productFacade.getProduct(id);
		return "product";
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getStorageQuantity() {
		return storageQuantity;
	}

	public void setStorageQuantity(Integer storageQuantity) {
		this.storageQuantity = storageQuantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getProviderVatin() {
		return providerVatin;
	}

	public void setProviderVatin(String providerVatin) {
		this.providerVatin = providerVatin;
	}
}