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
import org.hibernate.organs;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	       
	       Session session =	sessionFactory.openSession();
	       session.beginTransaction();
	       String s=request.getParameter("t9");
	       String s1=request.getParameter("t1");
	       int f=0;
	       Query queryResult = session.createQuery("from organs");
	       java.util.List allUsers;
	       String pa,na;
	       allUsers = queryResult.list();
	       System.out.println(allUsers.size());
	       for (int i = 0; i < allUsers.size(); i++) {
	        organs d1 = (organs) allUsers.get(i);
	        pa=d1.getOrgan();
	        na=d1.getUserId();
	      if(pa.equalsIgnoreCase(s))
	      {
	    	  Query queryResult1 = session.createQuery("from donor where UserId="+na);
		       java.util.List allUsers1;
		       String pa1;
		       allUsers1 = queryResult1.list();
		       System.out.println(allUsers1.size());
		       for (int j = 0; j < allUsers1.size(); j++) {
			        donor d2 = (donor) allUsers1.get(i);
			        pa1=d2.getLoc();
			        if(pa1.equalsIgnoreCase(s1))
			        {
			        	f=1;
			           response.sendRedirect("h3.html");
			        }
	    }
	      
	       
	}
	       }
	      if(f==0)
	      {
	    	  System.out.print("organ not available");
	      }
	       
	}
}

