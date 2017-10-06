package fr.orsys.calcul.tests;

import javax.xml.ws.Endpoint;


import fr.orsys.calcul.CalculImpl;

public class CalculPublishMain {

	public static void main(String[] args) {
		
		System.out.println("Déclaration de l'url");
		String url = "http://localhost:8888/CalculService";
		System.out.println("Instanciation du service");
		Object service = new CalculImpl();
		System.out.println("Publication du service \n a url:"+url);
		Endpoint.publish(url, service);

	}

}
