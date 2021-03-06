
package fr.orsys.service.calcul;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculService", targetNamespace = "calcul.service.orsys.fr", wsdlLocation = "http://localhost:8180/CalculServiceEJB/CalculService/CalculImpl?wsdl")
public class CalculService
    extends Service
{

    private final static URL CALCULSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULSERVICE_EXCEPTION;
    private final static QName CALCULSERVICE_QNAME = new QName("calcul.service.orsys.fr", "CalculService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8180/CalculServiceEJB/CalculService/CalculImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULSERVICE_WSDL_LOCATION = url;
        CALCULSERVICE_EXCEPTION = e;
    }

    public CalculService() {
        super(__getWsdlLocation(), CALCULSERVICE_QNAME);
    }

    public CalculService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULSERVICE_QNAME, features);
    }

    public CalculService(URL wsdlLocation) {
        super(wsdlLocation, CALCULSERVICE_QNAME);
    }

    public CalculService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULSERVICE_QNAME, features);
    }

    public CalculService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatriceContrat
     */
    @WebEndpoint(name = "CalculServicePort")
    public CalculatriceContrat getCalculServicePort() {
        return super.getPort(new QName("calcul.service.orsys.fr", "CalculServicePort"), CalculatriceContrat.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatriceContrat
     */
    @WebEndpoint(name = "CalculServicePort")
    public CalculatriceContrat getCalculServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("calcul.service.orsys.fr", "CalculServicePort"), CalculatriceContrat.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULSERVICE_EXCEPTION!= null) {
            throw CALCULSERVICE_EXCEPTION;
        }
        return CALCULSERVICE_WSDL_LOCATION;
    }

}
