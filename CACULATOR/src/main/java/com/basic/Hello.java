package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
        
        System.out.println("Hello Niki");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				PrintWriter out = response.getWriter();
		
				int a = Integer.parseInt(request.getParameter("n1"));
				int b = Integer.parseInt(request.getParameter("n2"));
				int c=0;
				if(request.getParameter("submit").equals("+"))
				{
				c= a+b;
				}
				else if(request.getParameter("submit").equals("-"))
				{
				 c=a-b;	
				}
				else if(request.getParameter("submit").equals("*"))
				{
				  c=a*b;	
				}
				else if(request.getParameter("submit").equals("/"))
				{
					c=a/b;
				}
				
				response.sendRedirect("index.jsp?result="+c);
				//out.print(c);
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
