package first_question;

public class Demo {

	public static void main(String[] args) {
		PatientType type = new PatientType();
		
		Patient p1 = type.getPatient("Symptomatic");
		
		p1.optFacility("Margoa");
		p1.displayFacility();
		
		System.out.println();
		
		Patient p2 = type.getPatient("Asymptomatic");
		
		p2.optFacility("Home Isolation");
		p2.displayFacility();

	}

}
