package it.uniroma3.progettoEsameSIW.controller.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

public class HelperCustomer {


	public boolean isValid(HttpServletRequest request) {

		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String birthDate = request.getParameter("birthDate");
		String email = request.getParameter("email");
		String userId =request.getParameter("userId");
		String password = request.getParameter("password");

		boolean errors = false;

		if ( name == null || name.equals("")) {
			request.setAttribute("nameErr","Name is mandatory");
			errors = true;
		}

		if ( surname == null || surname.equals("")) {
			request.setAttribute("surnameErr","Surname is mandatory");
			errors = true;
		}

		if ( birthDate == null || birthDate.equals("")) {
			request.setAttribute("birthDateErr","BirthDate is mandatory");
			errors = true;
		}
		else {
			try{
				SimpleDateFormat format = new SimpleDateFormat();
				format.parse(birthDate);
			}
			catch (ParseException e) {
				request.setAttribute("birthDateErr","Birth Date is must be a Date");
				errors = true;
			}
		}

		if ( email == null || email.equals("")) {
			request.setAttribute("emailErr","Email is mandatory");
			errors = true;
		}

		else {
			String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			if(email.matches(emailPattern))
				request.setAttribute("emailErr","Email is not valid");

		}
		
		if ( userId == null || userId.equals("")) {
			request.setAttribute("userIdErr","UderID is mandatory");
			errors = true;
		}
		
		if ( password == null || password.equals("")) {
			request.setAttribute("passwordErr","Password is mandatory");
			errors = true;
		}



		return !errors;
	}
}




