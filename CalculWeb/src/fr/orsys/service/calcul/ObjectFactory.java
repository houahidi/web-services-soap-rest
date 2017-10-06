
package fr.orsys.service.calcul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.orsys.service.calcul package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotifierRequete_QNAME = new QName("calcul.service.orsys.fr", "NotifierRequete");
    private final static QName _CalculerResponse_QNAME = new QName("calcul.service.orsys.fr", "CalculerResponse");
    private final static QName _Calculer_QNAME = new QName("calcul.service.orsys.fr", "Calculer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.orsys.service.calcul
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotifierRequete }
     * 
     */
    public NotifierRequete createNotifierRequete() {
        return new NotifierRequete();
    }

    /**
     * Create an instance of {@link CalculerResponse }
     * 
     */
    public CalculerResponse createCalculerResponse() {
        return new CalculerResponse();
    }

    /**
     * Create an instance of {@link Calculer }
     * 
     */
    public Calculer createCalculer() {
        return new Calculer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifierRequete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "calcul.service.orsys.fr", name = "NotifierRequete")
    public JAXBElement<NotifierRequete> createNotifierRequete(NotifierRequete value) {
        return new JAXBElement<NotifierRequete>(_NotifierRequete_QNAME, NotifierRequete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "calcul.service.orsys.fr", name = "CalculerResponse")
    public JAXBElement<CalculerResponse> createCalculerResponse(CalculerResponse value) {
        return new JAXBElement<CalculerResponse>(_CalculerResponse_QNAME, CalculerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "calcul.service.orsys.fr", name = "Calculer")
    public JAXBElement<Calculer> createCalculer(Calculer value) {
        return new JAXBElement<Calculer>(_Calculer_QNAME, Calculer.class, null, value);
    }

}
