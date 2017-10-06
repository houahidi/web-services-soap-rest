
package fr.carsat.service.soap.document;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.carsat.service.soap.document package. 
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

    private final static QName _ReponseAddition_QNAME = new QName("http://document.soap.service.carsat.fr/", "ReponseAddition");
    private final static QName _ReponseMultiplication_QNAME = new QName("http://document.soap.service.carsat.fr/", "ReponseMultiplication");
    private final static QName _RequeteMultiplication_QNAME = new QName("http://document.soap.service.carsat.fr/", "RequeteMultiplication");
    private final static QName _RequeteSoustraction_QNAME = new QName("http://document.soap.service.carsat.fr/", "RequeteSoustraction");
    private final static QName _RequeteDivision_QNAME = new QName("http://document.soap.service.carsat.fr/", "RequeteDivision");
    private final static QName _RequeteNotification_QNAME = new QName("http://document.soap.service.carsat.fr/", "RequeteNotification");
    private final static QName _RequeteAddition_QNAME = new QName("http://document.soap.service.carsat.fr/", "RequeteAddition");
    private final static QName _ReponseDivision_QNAME = new QName("http://document.soap.service.carsat.fr/", "ReponseDivision");
    private final static QName _ReponseSoustraction_QNAME = new QName("http://document.soap.service.carsat.fr/", "ReponseSoustraction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.carsat.service.soap.document
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequeteDivision }
     * 
     */
    public RequeteDivision createRequeteDivision() {
        return new RequeteDivision();
    }

    /**
     * Create an instance of {@link RequeteNotification }
     * 
     */
    public RequeteNotification createRequeteNotification() {
        return new RequeteNotification();
    }

    /**
     * Create an instance of {@link RequeteAddition }
     * 
     */
    public RequeteAddition createRequeteAddition() {
        return new RequeteAddition();
    }

    /**
     * Create an instance of {@link ReponseDivision }
     * 
     */
    public ReponseDivision createReponseDivision() {
        return new ReponseDivision();
    }

    /**
     * Create an instance of {@link ReponseSoustraction }
     * 
     */
    public ReponseSoustraction createReponseSoustraction() {
        return new ReponseSoustraction();
    }

    /**
     * Create an instance of {@link ReponseAddition }
     * 
     */
    public ReponseAddition createReponseAddition() {
        return new ReponseAddition();
    }

    /**
     * Create an instance of {@link ReponseMultiplication }
     * 
     */
    public ReponseMultiplication createReponseMultiplication() {
        return new ReponseMultiplication();
    }

    /**
     * Create an instance of {@link RequeteMultiplication }
     * 
     */
    public RequeteMultiplication createRequeteMultiplication() {
        return new RequeteMultiplication();
    }

    /**
     * Create an instance of {@link RequeteSoustraction }
     * 
     */
    public RequeteSoustraction createRequeteSoustraction() {
        return new RequeteSoustraction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReponseAddition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "ReponseAddition")
    public JAXBElement<ReponseAddition> createReponseAddition(ReponseAddition value) {
        return new JAXBElement<ReponseAddition>(_ReponseAddition_QNAME, ReponseAddition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReponseMultiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "ReponseMultiplication")
    public JAXBElement<ReponseMultiplication> createReponseMultiplication(ReponseMultiplication value) {
        return new JAXBElement<ReponseMultiplication>(_ReponseMultiplication_QNAME, ReponseMultiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequeteMultiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "RequeteMultiplication")
    public JAXBElement<RequeteMultiplication> createRequeteMultiplication(RequeteMultiplication value) {
        return new JAXBElement<RequeteMultiplication>(_RequeteMultiplication_QNAME, RequeteMultiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequeteSoustraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "RequeteSoustraction")
    public JAXBElement<RequeteSoustraction> createRequeteSoustraction(RequeteSoustraction value) {
        return new JAXBElement<RequeteSoustraction>(_RequeteSoustraction_QNAME, RequeteSoustraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequeteDivision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "RequeteDivision")
    public JAXBElement<RequeteDivision> createRequeteDivision(RequeteDivision value) {
        return new JAXBElement<RequeteDivision>(_RequeteDivision_QNAME, RequeteDivision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequeteNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "RequeteNotification")
    public JAXBElement<RequeteNotification> createRequeteNotification(RequeteNotification value) {
        return new JAXBElement<RequeteNotification>(_RequeteNotification_QNAME, RequeteNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequeteAddition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "RequeteAddition")
    public JAXBElement<RequeteAddition> createRequeteAddition(RequeteAddition value) {
        return new JAXBElement<RequeteAddition>(_RequeteAddition_QNAME, RequeteAddition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReponseDivision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "ReponseDivision")
    public JAXBElement<ReponseDivision> createReponseDivision(ReponseDivision value) {
        return new JAXBElement<ReponseDivision>(_ReponseDivision_QNAME, ReponseDivision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReponseSoustraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.soap.service.carsat.fr/", name = "ReponseSoustraction")
    public JAXBElement<ReponseSoustraction> createReponseSoustraction(ReponseSoustraction value) {
        return new JAXBElement<ReponseSoustraction>(_ReponseSoustraction_QNAME, ReponseSoustraction.class, null, value);
    }

}
