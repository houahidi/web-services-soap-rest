package fr.orsys.clients.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="LeClient")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TypeClient", propOrder= {"id","nom","prenom"})
public class Client {
	
	@XmlElement(name="Identifiant")
	private long id;
	@XmlElement(name="Nom")
	private String nom;
	@XmlElement(name="Prenom")
	private String prenom;
	
	public Client() {
	}

	public Client(long id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
