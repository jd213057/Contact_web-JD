package fr.gtm.Contact2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import fr.gtm.Contact2.entities.Contact;
import fr.gtm.Contact2.entities.Adresse;
import fr.gtm.Contact2.entities.Civilite;


public class ContactDAO {
	private EntityManagerFactory emf;

	public ContactDAO(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public void create(Contact contact) {
		// 1 - récupèrer un EntityManager (connexion)
		EntityManager em = emf.createEntityManager();
		// 2 - démarrer une transaction
		em.getTransaction().begin();
		// 3 - sauvegarder l'entité en base
		em.persist(contact);
		// 4 - valider la transaction
		em.getTransaction().commit();
		// 5 - fermer l'Entitymanager (connexion)
		em.close();
	}
	
	public Contact getContactById(long id) {
		EntityManager em = emf.createEntityManager();
		Contact contact = em.find(Contact.class, id);
		em.close();
		return contact;
	}
	
	public void delete(Contact contact) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// on réattache l'entité avant de la supprimer
		Contact c1 = em.find(Contact.class, contact.getId());
		em.remove(c1);
		
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(Contact contact) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(contact);
		em.getTransaction().commit();
		em.close();
	}
	
//	public List<Contact> getContactsWithAddresses(){
//		EntityManager em = emf.createEntityManager();
//		List<Contact> contacts = em.createNamedQuery("Contact.getWithAddress", Contact.class)
//										.getResultList();
//		em.close();
//		return contacts;
//	}
	
	public List<Contact> getContactsByCivilite(Civilite civilite){
		String sql = "SELECT c FROM Contact c WHERE c.civilite= :foo";
		EntityManager em = emf.createEntityManager();
		List<Contact> contacts = em.createQuery(sql, Contact.class)
										.setParameter("foo", civilite)
										.getResultList();
		em.close();
		return contacts;
	}
	
	public List<Contact> getContactsByNom(String nom){
		EntityManager em = emf.createEntityManager();
		List<Contact> contacts = em.createNamedQuery("Contact.getByNom", Contact.class)
										.setParameter("nom", nom+"%")
										.getResultList();
		em.close();
		return contacts;
	}
	
	public List<Contact> getAllContacts() {
		EntityManager em = emf.createEntityManager();
		List<Contact> contacts = em.createNamedQuery("Contact.getAllContacts", Contact.class).getResultList();
		em.close();
		return contacts;
	}
	
	
	
	
	
	
	
	
	
	
	public List<Adresse> getAllAdresses() {
		EntityManager em = emf.createEntityManager();
		List<Adresse> adresses = em.createNamedQuery("Adresse.getAllAdresses", Adresse.class).getResultList();
		em.close();
		return adresses;
	}
	public List<Adresse> getContactAdresses() {
		EntityManager em = emf.createEntityManager();
//		List<Adresse> adresses =em.find(Contact.class, id).adresses;
		
		List<Adresse> adresses = em.createNamedQuery("Contact.getWithAddress", Adresse.class).getResultList();
		em.close();
		return adresses;
	}
	
	public void create(Adresse adresse) {
		// 1 - récupèrer un EntityManager (connexion)
		EntityManager em = emf.createEntityManager();
		// 2 - démarrer une transaction
		em.getTransaction().begin();
		// 3 - sauvegarder l'entité en base
		em.persist(adresse);
		// 4 - valider la transaction
		em.getTransaction().commit();
		// 5 - fermer l'Entitymanager (connexion)
		em.close();
	}
	public Adresse getAdresseById(long id) {
		EntityManager em = emf.createEntityManager();
		Adresse adresse = em.find(Adresse.class, id);
		em.close();
		return adresse;
	}
	
	public void delete(Adresse adresse) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// on réattache l'entité avant de la supprimer
		Adresse a1 = em.find(Adresse.class, adresse.getId());
		em.remove(a1);
		
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(Adresse adresse) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(adresse);
		em.getTransaction().commit();
		em.close();
	}
	
	
//	public List<String> getEmails(Contact contact){
//		List<String> emails = new ArrayList<>();
//		EntityManager em = emf.createEntityManager();
//		Contact c1 = em.find(Contact.class, contact.getId());
//		for(String email : c1.getEmails()) {
//			emails.add(email);
//		}
//		em.close();
//		return emails;
//	}
	
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
