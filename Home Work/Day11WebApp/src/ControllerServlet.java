

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.login.loginCode;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
//		rd.forward(request, response);
		String user = request.getParameter("user");
		String email = request.getParameter("email");
		
		System.out.println(user);
		
		loginCode login  = new loginCode("Kartikeya");
		
		if(login.checkUser(user))
		{
			RequestDispatcher rd1 = request.getRequestDispatcher("success.jsp");
			rd1.forward(request, response);
		}
		else {
			RequestDispatcher rd1 = request.getRequestDispatcher("failure.jsp");
			rd1.forward(request, response);
		}
		
		System.out.println(user);
		System.out.println(email);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
