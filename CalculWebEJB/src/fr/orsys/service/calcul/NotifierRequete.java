
package fr.orsys.service.calcul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NotifierRequete complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NotifierRequete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qui" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifierRequete", propOrder = {
    "qui"
})
public class NotifierRequete {

    @XmlElement(name = "Qui")
    protected String qui;

    /**
     * Obtient la valeur de la propriété qui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQui() {
        return qui;
    }

    /**
     * Définit la valeur de la propriété qui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQui(String value) {
        this.qui = value;
    }

}
