package week4;

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
	
		System.out.print("Enter the first String :-" );
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		System.out.print("Enter the second String :- ");
		String str2 = input.nextLine();
		System.out.println("Before Swap the value of first string is :- " + str1);
		System.out.println("Before Swap the value of second string is :- " + str2);
		str1=str1.concat(str2);
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After Swap the value of first string is :- " +str1);
		System.out.println("After Swap the value of second string is :- "+str2);
		input.close();
	}

}
