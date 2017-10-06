
package fr.orsys.service.calcul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Calculer complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� operateur.
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
     * D�finit la valeur de la propri�t� operateur.
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
     * Obtient la valeur de la propri�t� operande1.
     * 
     */
    public double getOperande1() {
        return operande1;
    }

    /**
     * D�finit la valeur de la propri�t� operande1.
     * 
     */
    public void setOperande1(double value) {
        this.operande1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� operande2.
     * 
     */
    public double getOperande2() {
        return operande2;
    }

    /**
     * D�finit la valeur de la propri�t� operande2.
     * 
     */
    public void setOperande2(double value) {
        this.operande2 = value;
    }

}
