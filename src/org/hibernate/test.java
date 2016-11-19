package org.hibernate;

import org.hibernate.cfg.Configuration;


public class test {
	public static void main(String[] args) {
      organs user = new organs();
        
        user.setOrgan("hjdgshjhgsd");
       
        
      SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
      
      Session session =	sessionFactory.openSession();
      session.beginTransaction();
      session.save(user);
      session.getTransaction().commit();
      session.close();
      
      
      	}


}
