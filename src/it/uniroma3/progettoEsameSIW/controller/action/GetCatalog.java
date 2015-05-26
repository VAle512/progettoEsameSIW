package it.uniroma3.progettoEsameSIW.controller.action;

import it.uniroma3.progettoEsameSIW.model.Product;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class GetCatalog implements Action {

	@Override
	public String perform(HttpServletRequest request) {

//		ProductFacade facade = new ProductFacade();
//		List<Product> listP = facade.getAllProducts();
		List<Product> listP = new LinkedList<>();
		Product e = new Product("name", "code", "description", new Double(1), new Integer(2));
		Product e1 = new Product("name1", "code1", "description1", new Double(11), new Integer(22));
		listP.add(e);
		listP.add(e1);
		Product p1 = new Product("nome1", "code1","desc1",new Double(1),new Integer(1));
		Product p2 = new Product("nome2", "code2","desc2",new Double(2),new Integer(2));
//		List<Product> listP = new LinkedList<Product>();
		listP.add(p1);
		listP.add(p2);
		request.setAttribute("catalog", listP);
		return "/catalog.jsp";
	}

}
