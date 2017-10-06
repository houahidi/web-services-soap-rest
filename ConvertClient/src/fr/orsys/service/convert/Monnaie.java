
package fr.orsys.service.convert;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour monnaie.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="monnaie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dollar"/>
 *     &lt;enumeration value="Yen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "monnaie", namespace = "convert.service.orsys.fr")
@XmlEnum
public enum Monnaie {

    @XmlEnumValue("Dollar")
    DOLLAR("Dollar"),
    @XmlEnumValue("Yen")
    YEN("Yen");
    private final String value;

    Monnaie(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Monnaie fromValue(String v) {
        for (Monnaie c: Monnaie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
