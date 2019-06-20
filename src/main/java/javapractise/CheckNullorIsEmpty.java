package javapractise;

import org.apache.commons.lang3.StringUtils;

public class CheckNullorIsEmpty {

	public static void main(String[] args) {
		
		String input = null;
		String input1 = "";
		String input2 = "test";
		String input3 = " ";
		
		System.out.println(!isNullorEmpty(input));
		System.out.println(!isNullorEmpty(input1));
		System.out.println(!isNullorEmpty(input2));
		System.out.println(!isNullorEmpty(input3));
		
		System.out.println(!StringUtils.isBlank(input));
		System.out.println(!StringUtils.isBlank(input1));
		System.out.println(!StringUtils.isBlank(input2));
		System.out.println(!StringUtils.isBlank(input3));
		
		
		
	}
	
	
	public static boolean isNullorEmpty(String input) {
		return (input==null || input.isEmpty());
	}
	
	

}
