package it.uniroma3.progettoEsameSIW.controlle.helper;

import javax.servlet.http.HttpServletRequest;

public class HelperAddress {
	
	public boolean isValid(HttpServletRequest request) {

		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zipcode = request.getParameter("zipcode");
		String country = request.getParameter("country");
		boolean errors = false;

		if ( street == null || street.equals("")) {
			request.setAttribute("streetErr","Street is mandatory");
			errors = true;
		}
		
		if ( city == null || city.equals("")) {
			request.setAttribute("cityErr","City is mandatory");
			errors = true;
		}
		
		if ( state == null || state.equals("")) {
			request.setAttribute("stateErr","State is mandatory");
			errors = true;
		}
		
		if ( zipcode == null || zipcode.equals("")) {
			request.setAttribute("zipcodeErr","Zipcode is mandatory");
			errors = true;
		}
		
		if ( country == null || country.equals("")) {
			request.setAttribute("countryErr","Country is mandatory");
			errors = true;
		}
		
		return !errors;
	}

}
