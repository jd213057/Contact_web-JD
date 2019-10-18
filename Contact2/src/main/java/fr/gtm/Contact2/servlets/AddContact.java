package fr.gtm.Contact2.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.Contact2.entities.Civilite;
import fr.gtm.Contact2.entities.Contact;
import fr.gtm.Contact2.service.ContactServices;


@WebServlet("/AddContactServlet")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AddContact() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.COMMUNE_SERVICE);
		String page =""; 
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String civilite = request.getParameter("civilite");
		
			
		if(civilite==null ||civilite.isEmpty()|| nom.isEmpty()||nom==null || prenom.isEmpty() || prenom==null ) page="/index.jsp";

		else {	Contact contact = new Contact(Civilite.valueOf(civilite),nom, prenom);
		service.create(contact);
		page ="/show-contacts.jsp";}
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
