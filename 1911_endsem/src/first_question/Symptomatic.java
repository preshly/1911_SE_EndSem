package first_question;

public class Symptomatic extends Patient {

	@Override
	public void optFacility(String center) {
		type = "Symptomatic";
		facility = center + " Covid Care Center";
		
	}

	

}
