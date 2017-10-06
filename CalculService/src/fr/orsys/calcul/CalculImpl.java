/**
 * 
 */
package fr.orsys.calcul;

import javax.jws.WebService;

/**
 * @author Administrateur
 *
 */
@WebService(serviceName="CalculService", 
			endpointInterface="fr.orsys.calcul.CalculContrat",
			portName="CalculServicePort",
			targetNamespace="calcul.service.orsys.fr"
			)
public class CalculImpl implements CalculContrat {

	/* (non-Javadoc)
	 * @see fr.orsys.calcul.CalculContrat#calculer(fr.orsys.calcul.Operateurs, double, double)
	 */
	@Override
	public double calculer(Operateurs op, double operande1, double operande2) {
		
		
		System.out.println("Operateur "+ op.name());
		System.out.println("Operande 1 "+ operande1);
		System.out.println("Operande 2 "+ operande2);
		
		double resultat = 0;
		
		switch (op) {
		
			case ADD:
				resultat = operande1 + operande2;
				break;
			case MULTIPLY:
				resultat = operande1 * operande2;
				break;
			case DIVIDE:
				resultat = operande1 / operande2;
				break;
			case MINUS:
				resultat = operande1 - operande2;
				break;
		
		}
		
		return resultat;
	}

	/* (non-Javadoc)
	 * @see fr.orsys.calcul.CalculContrat#displayHello(java.lang.String)
	 */
	@Override
	public void displayHello(String to) {
		System.out.println("Hello "+ to);

	}

}
