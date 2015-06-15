package it.uniroma3.progettoEsameSIW.model.facade;

import it.uniroma3.progettoEsameSIW.model.Product;
import it.uniroma3.progettoEsameSIW.model.Provider;

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
			Integer storageQuantity, Long providerId)	{
		Provider pv = this.em.find(Provider.class, providerId);
		Product p = new Product(name, code, description, price, storageQuantity,pv);
		this.em.persist(p);
		pv.getProducts().add(p);
		this.em.merge(pv);
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
