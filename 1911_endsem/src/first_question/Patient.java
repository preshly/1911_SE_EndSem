package first_question;

public abstract class Patient {
	
	protected String facility;
	protected String type;
	public abstract void optFacility(String center);
	
	public void displayFacility() {
		System.out.println(this.type + " patient.");
		System.out.println("Opted for: " + this.facility);
	}
}
