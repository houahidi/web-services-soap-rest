package fr.orsys.calcul;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum(value=Integer.class)
public enum Operateurs {
	
	@XmlEnumValue("1")
	ADD,
	@XmlEnumValue("2")
	MINUS,
	@XmlEnumValue("3")
	MULTIPLY,
	@XmlEnumValue("4")
	DIVIDE
}
