
package fr.carsat.service.soap.document;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReponseAddition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReponseAddition">
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
@XmlRootElement(name="ReponseAddition")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReponseAddition", propOrder = {
    "resultat"
})
public class ReponseAddition {

    @XmlElement(name = "Resultat")
    protected double resultat;

    /**
     * Obtient la valeur de la propriété resultat.
     * 
     */
    public double getResultat() {
        return resultat;
    }

    /**
     * Définit la valeur de la propriété resultat.
     * 
     */
    public void setResultat(double value) {
        this.resultat = value;
    }

}
