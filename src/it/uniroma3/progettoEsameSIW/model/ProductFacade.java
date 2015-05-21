package it.uniroma3.progettoEsameSIW.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductFacade {
	
	private EntityManager em;
	private EntityManagerFactory emf;
	
	public ProductFacade() {
		this.emf = Persistence.createEntityManagerFactory("dbProgettoSIW-unit");
		this.em = this.emf.createEntityManager();
	}
	
	public void close() {
		this.em.close();
		this.emf.close();
	}
	
	public Product createProduct(String name, String code, String description, Double price,
			Integer storageQuantity)	{
		Product p = new Product(name, code, description, price, storageQuantity);
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.persist(p);
		tx.commit();
		this.close();
		return p;
	}
	
	public Product getProduct(Long id)	{
		Product p = this.em.find(Product.class, id);
		this.close();
		return p;
	}
	
	public List<Product> getAllProducts()	{
		Query q = this.em.createNamedQuery("getAllProducts");
		List<Product> lpList = q.getResultList();
		return lpList;
	}
	
	public void deleteProduct(Long id)		{
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		Product p = this.em.find(Product.class, id);
		this.em.remove(p);
		tx.commit();
		this.close();
	}
	
	public void updateProduct(Product p)	{
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.merge(p);
		tx.commit();
		this.close();
	}
}
