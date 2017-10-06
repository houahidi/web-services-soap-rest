package fr.orsys.calcul.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.orsys.service.calcul.CalculService;
import fr.orsys.service.calcul.CalculatriceContrat;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/calculer")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer op = Integer.valueOf( request.getParameter("operateur"));
		Double op1 =  Double.parseDouble(request.getParameter("operande1"));
		Double op2 = Double.parseDouble(request.getParameter("operande2"));
		
		CalculService calculService = new CalculService();
		CalculatriceContrat proxy = calculService.getCalculServicePort();
		
		double resultat = proxy.calculer(op, op1, op2);
		response.getWriter().append("Résultat :  " + resultat);
	}

}
