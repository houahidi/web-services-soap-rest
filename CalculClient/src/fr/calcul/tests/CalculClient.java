package fr.calcul.tests;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import fr.carsat.service.soap.document.CalculatriceContrat;
import fr.carsat.service.soap.document.CalculatriceService;
import fr.carsat.service.soap.document.ReponseAddition;
import fr.carsat.service.soap.document.ReponseDivision;
import fr.carsat.service.soap.document.RequeteAddition;
import fr.carsat.service.soap.document.RequeteDivision;

public class CalculClient {

	public static void main(String[] args) {
		
		System.out.println("Récuperation de proxy");
		CalculatriceService service = new CalculatriceService();
		CalculatriceContrat proxy = service.getCalculatriceServicePort();
		System.out.println("Appel de la méthode addition");
		RequeteAddition requete = new RequeteAddition();
		requete.setOperande1(6.1);
		requete.setOperande2(6.1);
		ReponseAddition reponse = proxy.addition(requete);
		System.out.println("Addition : "+ reponse.getResultat());
		//division
		RequeteDivision reqDiv = new RequeteDivision();
		reqDiv.setOperande1(6.5);
		reqDiv.setOperande2(3.9);
		ReponseDivision repDiv = proxy.division(reqDiv);
		System.out.println("Div : "+ repDiv.getResultat());
		
		try {
			//Génération flux xml pour la requete
			JAXBContext context = JAXBContext.newInstance(fr.carsat.service.soap.document.RequeteAddition.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(
			Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(requete, new FileWriter("requete.xml"));
			//Génération flux xml pour la reponse			
			context = JAXBContext.newInstance(fr.carsat.service.soap.document.ReponseAddition.class);
			marshaller = context.createMarshaller();
			marshaller.setProperty(
			Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(reponse, new FileWriter("reponse.xml"));
			} catch (JAXBException | IOException e) {
				e.printStackTrace();
			}

	}

}
