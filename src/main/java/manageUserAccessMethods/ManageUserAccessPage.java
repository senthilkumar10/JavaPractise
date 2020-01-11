package manageUserAccessMethods;

public class ManageUserAccessPage {
	
	protected boolean enterUserName(String userName) {
		System.out.println("This is to select the User ID :"+userName);
		return true;
	}

	protected boolean enterRole(String role) {
		System.out.println("The Role to be selected :"+role);
		return true;
	}

	protected boolean clickManageTab(){
		System.out.println("Manage User Tab clicked");
		return true;
	}

	protected boolean clickReviewandSubmit() {
		System.out.println("Reviewed the items and submitted it");
		return true;
	}	
	

}
