package javapractise;

public class CheckNullorIsEmpty {

	public static void main(String[] args) {
		
		String input = null;
		String input1 = "";
		String input2 = "test";
		
		System.out.println(!isNullorEmpty(input));
		System.out.println(!isNullorEmpty(input1));
		System.out.println(!isNullorEmpty(input2));

	}
	
	
	public static boolean isNullorEmpty(String input) {
		return (input==null || input.isEmpty())? true: false;
	}

}
