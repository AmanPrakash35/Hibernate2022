package Hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien aman=new Alien();
    	
    	aman.setAid(103);
    	aman.setAname("ABC");
    	aman.setCity("Patna");
    	
    	Configuration configuration=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	//System.out.println(sessionFactory);
    	//System.out.println(sessionFactory.isClosed());
    	
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.save(aman);
    	transaction.commit();
    	
    }
}
