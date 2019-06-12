package methodchaining;

public class MangeUserAccessTC {

	public static void main(String[] args) {
		//ManageUserAccessPage pageObj = new ManageUserAccessPage();
		ManageUserAccess manageObj = new ManageUserAccess();
		
		String temp = manageObj.selectUserID("Senthil").selectRole("EVP Role").getRequestID();
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		int[] arr = {5,4,8,9,10};
		
		int total = 14;
		
		int flag = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(total == arr[i]+arr[j]) {
					System.out.println(arr[i]);
					System.out.println(arr[j]);
					flag=1;
					break;
				}
				if(flag==1) {
					break;
				}
			}
		}
				
				
	*/			
		
		
		
	}

}
