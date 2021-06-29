package first_question;

public class Asymptomatic extends Patient{

	@Override
	public void optFacility(String center) {
		type = "Asymptomatic";
		facility = center ;
		
	}

}
