package fr.gtm.Contact2.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.Contact2.entities.Adresse;
import fr.gtm.Contact2.entities.Contact;
import fr.gtm.Contact2.service.ContactServices;


@WebServlet("/ContactInfoServlet")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.COMMUNE_SERVICE);
		String page =""; 
		String id = request.getParameter("id");
		long id1 =Long.parseLong(id);
			Contact contact = service.getContactById(id1);
			List<Adresse> adresses = service.getContactAdresses();
			contact.setAdresses(adresses);
			request.setAttribute("contacts", contact);
			page ="/show-contact-info.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
