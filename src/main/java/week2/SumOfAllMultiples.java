package week2;

import java.util.Scanner;

public class SumOfAllMultiples {

	public static void main(String[] args) {
		System.out.println("Enter a number to find the sum of multiples of 3 or 5");
		int a,sum=0;
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		for(int i=1;i<a;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.print(i +", ");
				sum=sum+i;		
			}
		}
		System.out.println("\n"+"The Sum is " + sum);
	}
}
