package fr.gtm.Contact2.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.Contact2.entities.Civilite;
import fr.gtm.Contact2.entities.Contact;
import fr.gtm.Contact2.service.ContactServices;

/**
 * Servlet implementation class Update2Servlet
 */
@WebServlet("/Update2Servlet")
public class Update2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.COMMUNE_SERVICE);
		String page =""; 
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String civilite = request.getParameter("civilite");
		String id = request.getParameter("id");
		long id1 =Long.parseLong(id);
		Contact contact = service.getContactById(id1);
			
		if(civilite==null ||civilite.isEmpty()|| nom.isEmpty()||nom==null || prenom.isEmpty() || prenom==null ) page="/index.jsp";

		else {	
		contact.setCivilite(Civilite.valueOf(civilite));
		contact.setNom(nom);
		contact.setPrenom(prenom);
		service.update(contact);
		
		page ="/show-contacts.jsp";}
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
