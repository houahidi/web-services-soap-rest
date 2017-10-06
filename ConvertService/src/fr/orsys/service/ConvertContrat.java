package fr.orsys.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.RequestWrapper;

@WebService(name="ConvertisseurContrat",
			targetNamespace="convert.service.orsys.fr")
@SOAPBinding(style=Style.RPC)
public interface ConvertContrat {
	
	@WebMethod(operationName="ConvertirMonnaie",action="urn:Convertir",exclude=false)
	@WebResult(name="somme", header=false,partName="SommePart") double convertir(
			@WebParam(name="monnaie", partName="MonnaiePart")Monnaie monnaie, 
			@WebParam(name="montant", partName="MontantPart") double montant);

}