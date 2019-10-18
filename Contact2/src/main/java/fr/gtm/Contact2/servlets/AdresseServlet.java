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

import fr.gtm.Contact2.service.AdresseServices;
import fr.gtm.Contact2.service.ContactServices;



@WebServlet("/AdresseServlet")
public class AdresseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdresseServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.COMMUNE_SERVICE);
		String page =""; 
			List<Adresse> adresses = service.getAllAdresses();
			request.setAttribute("adresses", adresses);
			page ="/show-adresses.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
