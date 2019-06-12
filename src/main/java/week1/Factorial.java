package week1;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number to find factorial = ");
		int fact,temp=1;
		Scanner input = new Scanner(System.in);
		fact=input.nextInt();
		if(fact==0)
		{
			System.out.println("Please enter a number other than Zero");
		}
		else
		{
			for(int i=1;i<=fact;i++)
			{
				temp = temp*i;
			}
			System.out.println("The Factorial of the given number is "+temp);
		}
	}



}
