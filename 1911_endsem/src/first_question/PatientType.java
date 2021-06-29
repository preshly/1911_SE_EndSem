package first_question;

public class PatientType {
	
	public Patient getPatient(String type) {
		if (type == null)
			return null;
		if(type.equalsIgnoreCase("SYMPTOMATIC"))
			return new Symptomatic();
		else if(type.equalsIgnoreCase("ASYMPTOMATIC"))
			return new Asymptomatic();
		
		return null;
	}

}
