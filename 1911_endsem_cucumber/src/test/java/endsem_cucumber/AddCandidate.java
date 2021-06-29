
package endsem_cucumber;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddCandidate {
	
	private static Logger logger = Logger.getLogger(AddCandidate.class.getName());
	private Candidate c1;
	
	@Given("I want to enter candidate details")
	public void i_want_to_enter_candidate_details() {
		logger.log(Level.INFO,"\n Enter Candidate Details \n" );
	}

	@When("I set candidate name and id")
	public void i_set_candidate_name_and_id() {
		c1 = new Candidate(2, "Messi");
	}

	@When("calculate total")
	public void calculate_total() {
		c1.calculateTotal(false, true, true, true);
	}

	@When("save")
	public void save() {
		SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(c1);
		session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
	}

	@Then("The details should be saved to the database")
	public void the_details_should_be_saved_to_the_database() {
		logger.log(Level.INFO,"\n Candidate Details saved to database. \n" );
	}

}
