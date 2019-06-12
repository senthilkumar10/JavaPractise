package methodchaining;

public class ManageUserAccessPage {
	
	public boolean enterUserName(String userName) {
		System.out.println("This is to select the User ID :"+userName);
		return true;
	}
	
	public boolean enterRole(String role) {
		System.out.println("The Role to be selected :"+role);
		return true;
	}
	
	public boolean clickReviewandSubmit() {
		System.out.println("Reviewed the items and submitted it");
		return true;
	}	
	

}
