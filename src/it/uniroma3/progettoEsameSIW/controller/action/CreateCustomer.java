package it.uniroma3.progettoEsameSIW.controller.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import it.uniroma3.progettoEsameSIW.controller.helper.HelperAddress;
import it.uniroma3.progettoEsameSIW.controller.helper.HelperCustomer;
import it.uniroma3.progettoEsameSIW.model.Address;
import it.uniroma3.progettoEsameSIW.model.Customer;
import it.uniroma3.progettoEsameSIW.model.CustomerFacade;

import javax.servlet.http.HttpServletRequest;

public class CreateCustomer implements Action{
	

	@Override
	public String perform(HttpServletRequest request) {
			
		HelperCustomer helperCustomer = new HelperCustomer();
		HelperAddress helperAddress = new HelperAddress();
		if (helperCustomer.isValid(request) && helperAddress.isValid(request))	{
			
			String street = request.getParameter("street");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String zipcode = request.getParameter("zipcode");
			String country = request.getParameter("country");
 			Address address = new Address(street, city, state, zipcode, country);
			CustomerFacade facade = new CustomerFacade();
			String name = request.getParameter("name");
			String surname = request.getParameter("surname");
			SimpleDateFormat format = new SimpleDateFormat();
			Date birthDate = null;
			try {
				birthDate = format.parse(request.getParameter("birthDate"));
			} catch (ParseException e) {}
			String email =  request.getParameter("email");
			String userId =  request.getParameter("userId");
			String password = request.getParameter("password");
			Customer customer = facade.createCustomer(name, surname, birthDate, new Date(), address, email, userId, password);
			request.setAttribute("customer", customer);
		
		return "/registrazioneEffettutata.jsp";
		}
		else {
			return"/newCustomer.jsp";
		}
	}

}
