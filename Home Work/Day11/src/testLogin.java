

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testLogin
 * Init Parameter to fetch data from web.xml
 * Dispatcher function to servlet2 and servlet3 java files
 * Question 1 and 2 both are in this
 */
public class testLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public testLogin() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	
    	System.out.println(getInitParameter("username"));
    	System.out.println(getInitParameter("email"));
    	System.out.println(getInitParameter("pass"));
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("Init Parameter has been initialized");
		
		RequestDispatcher rd1 = request.getRequestDispatcher("/servlet3");
		rd1.forward(request, response);
		
		RequestDispatcher rd2 = request.getRequestDispatcher("/servlet2");
		rd2.include(request, response);
		
		response.sendRedirect("https://google.com");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
