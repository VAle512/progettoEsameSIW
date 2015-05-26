package it.uniroma3.progettoEsameSIW.controller.action;

import it.uniroma3.progettoEsameSIW.model.Product;
import it.uniroma3.progettoEsameSIW.model.ProductFacade;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class GetCatalog implements Action {

	@Override
	public String perform(HttpServletRequest request) {

		ProductFacade facade = new ProductFacade();
		List<Product> listP = facade.getAllProducts();
		
//		Product p1 = new Product("nome1", "code1","desc1",new Double(1),new Integer(1));
//		Product p2 = new Product("nome2", "code2","desc2",new Double(2),new Integer(2));
//		List<Product> listP = new LinkedList<Product>();
//		listP.add(p1);
//		listP.add(p2);
		
		request.setAttribute("catalog", listP);
		return "/catalog.jsp";
	}

}
