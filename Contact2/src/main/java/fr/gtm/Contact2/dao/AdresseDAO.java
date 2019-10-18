package fr.gtm.Contact2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import fr.gtm.Contact2.entities.Adresse;
import fr.gtm.Contact2.entities.Contact;

public class AdresseDAO extends AbstractDAO<Adresse, Long>{

	public AdresseDAO(EntityManagerFactory emf) {
		super(emf, Adresse.class);
	}
	public List<Adresse> getAllAdresses() {
		EntityManager em = emf.createEntityManager();
		List<Adresse> adresses = em.createNamedQuery("Adresse.getAllAdresses", Adresse.class).getResultList();
		em.close();
		return adresses;
	}
}
