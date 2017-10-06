package fr.orsys.calcul.tests;

import javax.xml.ws.Endpoint;


import fr.orsys.service.ConverServiceImpl;
import fr.orsys.service.ConvertContrat;

public class ConvertPublishMain {

	public static void main(String[] args) {
		
		System.out.println("Déclaration de l'url");
		String url = "http://10.1.1.83:7777/ConvertService";
		System.out.println("Instanciation du service");
		ConvertContrat service = new ConverServiceImpl();
		System.out.println("Publication du service \n a url:"+url);
		Endpoint.publish(url, service);

	}

}
