package fr.gtm.Contact2.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import fr.gtm.Contact2.dao.ContactDAO;
import fr.gtm.Contact2.entities.Adresse;
import fr.gtm.Contact2.entities.Contact;

public class ContactServices {
	
	private ContactDAO dao;
	
	public ContactServices(EntityManagerFactory emf) {
		dao = new ContactDAO(emf);
	}
	
	public List<Contact> getAllContacts() {
		return dao.getAllContacts();
	}
	public List<Adresse> getAllAdresses() {
		return dao.getAllAdresses();
	}
	public List<Adresse> getContactAdresses() {
		return dao.getContactAdresses();
	}
	
	public void create(Contact contact) {
		dao.create(contact);
	}
	
	public void update(Contact contact) {
		dao.update(contact);
	}
	
	public void delete(Contact contact) {
		dao.delete(contact);
	}
	
	public Contact getContactById(long id1) {
		return dao.getContactById(id1);
	}
	
	public void create(Adresse adresse) {
	dao.create(adresse);
    }

public void update(Adresse adresse) {
	dao.update(adresse);
    }

public void delete(Adresse adresse) {
	dao.delete(adresse);
    }

public Adresse getAdresseById(long id1) {
	return dao.getAdresseById(id1);
    }

}
