package second_question;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class CandidateDemo {

	public static void main(String[] args) {
		Candidate c1 = new Candidate(3, "Ronaldo");
		
		c1.calculateTotal(true, true, true, true);
		
		
		SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(c1);
		session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();

	}

}
