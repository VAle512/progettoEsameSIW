package it.uniroma3.progettoEsameSIW.controlle.helper;

import javax.servlet.http.HttpServletRequest;

public class HelperAddressId {

	public boolean isValid(HttpServletRequest request) {

		String id = request.getParameter("id");
		boolean errors = false;

		if ( id == null || id.equals("")) {
			request.setAttribute("idErr","Invalid id");
			errors = true;
		}
		else {
			try{
				Long.parseLong(id);
			}
			catch (NumberFormatException e) {
				request.setAttribute("id","Invalid id");
				errors = true;
			}
		}
		return !errors;
	}



}
