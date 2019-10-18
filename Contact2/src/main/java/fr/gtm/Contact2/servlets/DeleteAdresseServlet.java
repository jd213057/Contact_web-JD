package fr.gtm.Contact2.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.gtm.Contact2.entities.Adresse;
import fr.gtm.Contact2.entities.Contact;
import fr.gtm.Contact2.service.ContactServices;


@WebServlet("/DeleteAdresseServlet")
public class DeleteAdresseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.COMMUNE_SERVICE);
		String page =""; 
		String id = request.getParameter("id");
		long id1 =Long.parseLong(id);
		Adresse adresse = service.getAdresseById(id1);
			service.delete(adresse);
			page ="/show-adresses.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
