package org.hibernate;

import org.hibernate.cfg.Configuration;


public class test {
	public static void main(String[] args) {
      organs user = new organs();
        user.setId(1);
       user.setOrgan("hjgjgjgj");
       user.setUserId("skjdhkjsahkash");
       
        
        
      SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();        		
      
      Session session =	sessionFactory.openSession();
      session.beginTransaction();
      session.save(user);
      session.getTransaction().commit();
      session.close();
      
      
      	}


}
