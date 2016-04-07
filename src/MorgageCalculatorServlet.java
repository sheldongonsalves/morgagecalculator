

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MorgageCalculatorServlet
 */
@WebServlet("/MorgageCalculatorServlet")
public class MorgageCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MorgageCalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int principalAmt=Integer.parseInt(request.getParameter("principal"));
		int years=Integer.parseInt(request.getParameter("years"));
		int months=years*12;
		double result;
		CalculateAmount ca=new CalculateAmount(); 
		Morgage morg = new Morgage() ;
		morg.setMonths(months);
		morg.setPrincipal(principalAmt);
		result=ca.CalculatedMorgage(morg.getMonths(),morg.getPrincipal());
		request.setAttribute("result", result);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
