
package fr.carsat.service.soap.document;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReponseSoustraction complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReponseSoustraction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resultat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReponseSoustraction", propOrder = {
    "resultat"
})
public class ReponseSoustraction {

    @XmlElement(name = "Resultat")
    protected double resultat;

    /**
     * Obtient la valeur de la propri�t� resultat.
     * 
     */
    public double getResultat() {
        return resultat;
    }

    /**
     * D�finit la valeur de la propri�t� resultat.
     * 
     */
    public void setResultat(double value) {
        this.resultat = value;
    }

}
