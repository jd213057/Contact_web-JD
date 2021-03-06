package fr.gtm.Contact2.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.Contact2.entities.Contact;
import fr.gtm.Contact2.service.ContactServices;
import fr.gtm.Contact2.servlets.Constantes;




@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ContactServlet() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.COMMUNE_SERVICE);
		String page =""; 
			List<Contact> contacts = service.getAllContacts();
			request.setAttribute("contacts", contacts);
			page ="/show-contacts.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
