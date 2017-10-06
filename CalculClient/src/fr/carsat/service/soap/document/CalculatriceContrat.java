
package fr.carsat.service.soap.document;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatriceContrat", targetNamespace = "http://document.soap.service.carsat.fr/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatriceContrat {


    /**
     * 
     * @param parameters
     * @return
     *     returns fr.carsat.service.soap.document.ReponseAddition
     */
    @WebMethod(operationName = "Addition", action = "urn:add")
    @WebResult(name = "ReponseAddition", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
    @Action(input = "urn:add", output = "http://document.soap.service.carsat.fr/CalculatriceContrat/AdditionResponse")
    public ReponseAddition addition(
        @WebParam(name = "RequeteAddition", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
        RequeteAddition parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fr.carsat.service.soap.document.ReponseDivision
     */
    @WebMethod(operationName = "Division", action = "urn:div")
    @WebResult(name = "ReponseDivision", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
    @Action(input = "urn:div", output = "http://document.soap.service.carsat.fr/CalculatriceContrat/DivisionResponse")
    public ReponseDivision division(
        @WebParam(name = "RequeteDivision", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
        RequeteDivision parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fr.carsat.service.soap.document.ReponseMultiplication
     */
    @WebMethod(operationName = "Multiplication", action = "urn:mul")
    @WebResult(name = "ReponseMultiplication", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
    @Action(input = "urn:mul", output = "http://document.soap.service.carsat.fr/CalculatriceContrat/MultiplicationResponse")
    public ReponseMultiplication multiplication(
        @WebParam(name = "RequeteMultiplication", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
        RequeteMultiplication parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns fr.carsat.service.soap.document.ReponseSoustraction
     */
    @WebMethod(operationName = "Soustraction", action = "urn:min")
    @WebResult(name = "ReponseSoustraction", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
    @Action(input = "urn:min", output = "http://document.soap.service.carsat.fr/CalculatriceContrat/SoustractionResponse")
    public ReponseSoustraction soustraction(
        @WebParam(name = "RequeteSoustraction", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
        RequeteSoustraction parameters);

    /**
     * 
     * @param parameters
     */
    @WebMethod(operationName = "Notification", action = "urn:notify")
    @Oneway
    @Action(input = "urn:notify")
    public void notification(
        @WebParam(name = "RequeteNotification", targetNamespace = "http://document.soap.service.carsat.fr/", partName = "parameters")
        RequeteNotification parameters);

}