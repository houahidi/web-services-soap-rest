/**
 * 
 */
package fr.orsys.calcul;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;

/**
 * Contrat de service de la calculatrice
 * 
 * @author Administrateur
 *
 */
@WebService(
		name="CalculatriceContrat",
		targetNamespace="calcul.service.orsys.fr"
		)
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface CalculContrat {
	
	/**
	 * calculer le resultat de l'operation arithmetique 
	 *
	 * @param op
	 * @param operande1
	 * @param operande2
	 * @return
	 */
	@WebMethod(operationName="Calculer", action="urn:calculer")
	
	@WebResult(name="Resultat") double calculer(@WebParam(name="Operateur") Operateurs op,
					@WebParam(name="Operande1") double operande1,
					@WebParam(name="Operande2")	double operande2);
	
	@Oneway
	@WebMethod(operationName="Notifier", action="urn:notifier")
	@RequestWrapper(localName="NotifierRequete",partName="NotifierPart")
	void displayHello(@WebParam(name="Qui")String to);

}
