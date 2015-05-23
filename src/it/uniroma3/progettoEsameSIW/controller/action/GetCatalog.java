package it.uniroma3.progettoEsameSIW.controller.action;

import it.uniroma3.progettoEsameSIW.model.Product;
import it.uniroma3.progettoEsameSIW.model.ProductFacade;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class GetCatalog implements Action {

	@Override
	public String perform(HttpServletRequest request) {

		ProductFacade facade = new ProductFacade();
		List<Product> listP = facade.getAllProducts();
		request.setAttribute("catalog", listP);
		return "/catalog.jsp";
	}

}
