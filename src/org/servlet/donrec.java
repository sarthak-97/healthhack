package org.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




import org.hibernate.donor;
/**
 * Servlet implementation class donrec
 */
@WebServlet("/donrec")
public class donrec extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		String UserId=request.getParameter("t1");
		String latitude=request.getParameter("t2");
		String longitude=request.getParameter("t4");
		String UserName=request.getParameter("t5");
		String Address=request.getParameter("t3");
		String Dob=request.getParameter("t6");
		String Diseases=request.getParameter("t7");
		String loc=request.getParameter("t8");
	    
			SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
		       
		       Session session =	sessionFactory.openSession();
		       session.beginTransaction();

		       
		    donor d= new donor();  
		      
		       d.setUserName(UserName);
		       d.setUserId(UserId);
               d.setLatitude(latitude);
             d.setAddress(Address)
            ;
             
               d.setLoc(loc);
		         session.save(d);
		         System.out.println("hello");
			       session.getTransaction().commit();
			       session.close();
			       response.setContentType("text/html");
			       request.setAttribute("t1",UserId);
			       request.getRequestDispatcher("/home2.jsp").forward(request, response);
			       
		            
			 }   
	
	

	}


