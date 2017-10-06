package fr.orsys.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(value=String.class)
public enum Monnaie {
	
	@XmlEnumValue("Dollar")
	Dollar("Dollar", 0.90f),
	
	@XmlEnumValue("Yen")
	Yen("Yen", 132.78f);	
	
	private String nom;
	private float taux;
	
	
	private Monnaie(String nom, float taux) {
		this.setNom(nom);
		this.setTaux(taux);
	}


	public float getTaux() {
		return taux;
	}


	public void setTaux(float taux) {
		this.taux = taux;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	
	

}
