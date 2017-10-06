package fr.orsys.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(serviceName="ConvertisseurService",
			endpointInterface="fr.orsys.service.ConvertContrat",
			targetNamespace="convert.service.orsys.fr",
			portName="ConvertServicePort")
public class ConverServiceImpl implements ConvertContrat {
	
	
	/* (non-Javadoc)
	 * @see fr.orsys.service.ConvertContrat#convertir(java.lang.String, double)
	 */
	@Override
	public double convertir(Monnaie monnaie, double montant) {
		
		//Monnaie myMonnie = Monnaie.valueOf(monnaie);
		
		return monnaie.getTaux() * montant;
	}

}
