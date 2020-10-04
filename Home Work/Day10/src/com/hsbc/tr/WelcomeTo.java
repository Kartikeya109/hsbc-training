package com.hsbc.tr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeTo
 * all overriding methods of servlet class
 */
public class WelcomeTo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     * Question 2 and 3
     */
    public WelcomeTo() {
        // TODO Auto-generated constructor stub
    	
    }

    @Override
    public void init() throws ServletException {
    	
    	System.out.println("I am called ones when initailized");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("Welcome To Servlets Programming");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("I am called ones, when destroyed or stopped");
	}

}
