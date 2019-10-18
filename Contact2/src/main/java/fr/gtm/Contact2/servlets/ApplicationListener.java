package fr.gtm.Contact2.servlets;

import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.gtm.Contact2.service.ContactServices;



@WebListener
public class ApplicationListener implements ServletContextListener {

	private static final Logger LOG = Logger.getLogger("contacts");
	
	
	 public void contextInitialized(ServletContextEvent sce)  { 
	    	LOG.info(">>> application démarée");
	    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("contacts");
	    	LOG.info(">>> EMF : "+emf);
	    	ServletContext application = sce.getServletContext();
	    	application.setAttribute(Constantes.EMF,  emf);
	    	ContactServices service = new ContactServices(emf);
	    	LOG.info(">>> service : "+service);
	    	application.setAttribute(Constantes.COMMUNE_SERVICE,  service);
	    	
	    	
	    }
		

    public void contextDestroyed(ServletContextEvent sce)  { 
    	EntityManagerFactory emf = (EntityManagerFactory) sce.getServletContext().getAttribute(Constantes.EMF);
    	emf.close();
    	LOG.info(">>> application retirée");
    	LOG.info(">>> EMF closed ");
    }

	
   
}
