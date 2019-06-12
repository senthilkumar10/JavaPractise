package methodchaining;

public class ManageUserAccess extends ManageUserAccessPage {
	
	/*ManageUserAccessPage pageObj;
	
	public ManageUserAccess(ManageUserAccessPage obj){
		this.pageObj = obj;
	}*/
	
	public ManageUserAccess selectUserID(String userID) {
		enterUserName(userID);
		return this;
	}

	public ManageUserAccess selectRole(String role) {
		enterRole(role);
		return this;
	}
	
	public ManageUserAccess reviewAndSubmit() {
		clickReviewandSubmit();
		return this;
	}
	
	public String getRequestID() {
		return "12345";		
	}
	
}
