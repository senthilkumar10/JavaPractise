package week4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.print("Enter a string to reverse it = ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("The reversed string is =");

		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		input.close();
	}

}
