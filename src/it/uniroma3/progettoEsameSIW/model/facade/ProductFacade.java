package it.uniroma3.progettoEsameSIW.model.facade;

import it.uniroma3.progettoEsameSIW.model.Product;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="pFacade")
public class ProductFacade {
	
	@PersistenceContext(unitName = "dbProgettoSIW-unit")
	private EntityManager em;

	
	public Product createProduct(String name, String code, String description, Double price,
			Integer storageQuantity)	{
		Product p = new Product(name, code, description, price, storageQuantity);
		this.em.persist(p);
		return p;
	}
	
	public Product getProduct(Long id)	{
		Product p = this.em.find(Product.class, id);
		return p;
	}
	
	public List<Product> getAllProducts()	{
		Query q = this.em.createNamedQuery("getAllProducts");
		List<Product> lpList = q.getResultList();
		return lpList;
	}
	
	public void deleteProduct(Long id)		{
		Product p = this.em.find(Product.class, id);
		this.em.remove(p);
	}
	
	public void updateProduct(Product p)	{
		this.em.merge(p);
	}
}
