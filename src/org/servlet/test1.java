package org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.donor;
import org.hibernate.organs;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
public class test1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String pa,na,a1,a2,a3,uname,s,nam;
			
		 s=(String) request.getAttribute("t2");
		System.out.println(s);
		
SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
	    
	    Session session =	sessionFactory.openSession();
	    session.beginTransaction();

	 
	 Query queryResult = session.createQuery("from donor");
	 java.util.List allUsers;
PrintWriter pw=response.getWriter();

	 allUsers = queryResult.list();
	 System.out.println(allUsers.size());
	 for (int i = 0; i < allUsers.size(); i++) {
	 donor d= (donor)allUsers.get(i);  
	 pa=d.getLoc();
	 if(s.equalsIgnoreCase(pa))
	 {
		 uname=d.getUserName();
	 na=d.getAddress();
	 a1=d.getLatitude();
	 a2=d.getLongitude();
	 a3=d.getMob();

	 pw.println(uname);
	 pw.println(na);
	 pw.println(a1);
	 pw.println(a2);
	 pw.println(a3);
	 
	 }
	 }
	

		

		
	
}
}	