package methodchaining;

import manageUserAccessMethods.ManageUserAccessPage;

public class ManageUserAccess extends ManageUserAccessPage {

	public ManageUserAccess selectUserID(String userID) {
		enterUserName(userID);
		return this;
	}

	public roleSelection clickNextInUserTab(){
		System.out.println("Clicked Next In User Selection Tab");
		return new roleSelection();
	}

}





class roleSelection extends ManageUserAccessPage{

	public roleSelection selectRoles(String role) {
		enterRole(role);
		return this;
	}

	public reviewAndSubmit clickNextInSelectRoleTab(){
		System.out.println("Clicked Next In User Role Selection Tab");
		return new reviewAndSubmit();
	}

}

class reviewAndSubmit extends ManageUserAccessPage {

	public reviewAndSubmit reviewAndSubmit() {
		clickReviewandSubmit();
		return this;
	}

	public reviewAndSubmit clickManageUserTab() {
		clickManageTab();
		return this;
	}

	public String getRequestID() {
		return "12345";
	}
}