package fr.gtm.Contact2.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import fr.gtm.Contact2.dao.AdresseDAO;
import fr.gtm.Contact2.entities.Adresse;


public class AdresseServices {
private AdresseDAO dao;
	
	public AdresseServices(EntityManagerFactory emf) {
		dao = new AdresseDAO(emf);
	}
	
	public List<Adresse> getAllAdresses() {
		return dao.getAllAdresses();
	}
	
//	public void create(Adresse adresse) {
//		dao.create(adresse);
//	}
//	
//	public void update(Adresse adresse) {
//		dao.update(adresse);
//	}
	
//	public void delete(Adresse adresse) {
//		dao.delete(adresse);
//	}
	
//	public Contact getContactById(long id1) {
//		return dao.getContactById(id1);
//	}

}
