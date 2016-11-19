package org.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.organs;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class orgnrec
 */
@WebServlet("/orgnrec")
public class orgnrec extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	       
	       Session session =	sessionFactory.openSession();
	       session.beginTransaction();
	       String UserId=request.getParameter("t1");
			 String organs =request.getParameter("t2");
			organs user1= new organs();
		       user1.setOrgan("organs");
		       user1.setUserId("userId");
		         
		         session.save(user1);
		         System.out.println("hello");
		         session.getTransaction().commit();
			       session.close();
		
	}

}
