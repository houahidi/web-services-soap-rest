
package fr.orsys.service.calcul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Calculer complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Calculer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operateur" type="{calcul.service.orsys.fr}operateurs" minOccurs="0"/>
 *         &lt;element name="Operande1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Operande2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calculer", propOrder = {
    "operateur",
    "operande1",
    "operande2"
})
public class Calculer {

    @XmlElement(name = "Operateur")
    protected Integer operateur;
    @XmlElement(name = "Operande1")
    protected double operande1;
    @XmlElement(name = "Operande2")
    protected double operande2;

    /**
     * Obtient la valeur de la propriété operateur.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperateur() {
        return operateur;
    }

    /**
     * Définit la valeur de la propriété operateur.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperateur(Integer value) {
        this.operateur = value;
    }

    /**
     * Obtient la valeur de la propriété operande1.
     * 
     */
    public double getOperande1() {
        return operande1;
    }

    /**
     * Définit la valeur de la propriété operande1.
     * 
     */
    public void setOperande1(double value) {
        this.operande1 = value;
    }

    /**
     * Obtient la valeur de la propriété operande2.
     * 
     */
    public double getOperande2() {
        return operande2;
    }

    /**
     * Définit la valeur de la propriété operande2.
     * 
     */
    public void setOperande2(double value) {
        this.operande2 = value;
    }

}
