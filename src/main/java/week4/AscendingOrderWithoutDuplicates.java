package week4;

public class AscendingOrderWithoutDuplicates {

	public static void main(String[] args) {
		
		String input = "Good Looking";
		int flag=0;
		String output = "";
		char oneText;
		
		input = input.replaceAll(" ", "");
		
		System.out.println(input);
		
		for(int i=0;i<input.length();i++) {		
			for(int j=1;j<=i;j++) {
				if(input.charAt(i)==input.charAt(j)) {
					flag=1;
				}else {
					flag=0;
				}
				
			}
			
			if(flag==0) {
				output = output+input.charAt(i);
			}
			
		}
		
		System.out.println(output);
		
		

		/*
		  
		  String input = "186553";
		
		for(int i=0;i<input.length();i++) {
			for(int j=0;j<input.length();j++) {
				if(input.charAt(i)) {
					
				}
			}
		}
		
		*/
		

	}

}
