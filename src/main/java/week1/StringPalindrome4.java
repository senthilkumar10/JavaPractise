package week1;

import java.util.Scanner;

public class StringPalindrome4 {

	public static void main(String[] args) {

		// Get the String to determine whether it is a Palindrome or not

		System.out.println("Enter a String to verify is it a Palindrome or not = ");

		//Declare the variable and get the input string
		String str,revStr="";
		Scanner input = new Scanner(System.in);
		str = input.next();

		// Get the length of the given string
		int len = str.length();

		//Reverse the string

		for(int i=len-1;i>=0;i--)
		{
			revStr=revStr+str.charAt(i);
		}

			if(str.equalsIgnoreCase(revStr))
			System.out.println(str + " is a Palindrome");
		else
			System.out.println(str + " is not a Palindrome");

		
	}

}
