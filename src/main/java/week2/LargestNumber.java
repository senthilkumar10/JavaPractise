package week2;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		System.out.println("Enter a single digit =");
		Scanner input = new Scanner(System.in);
		int digit = input.nextInt();
		System.out.println("Enter a 2 or 3 Digit Number to find the Largest Number which is less than the given number = ");
		int largestNum = input.nextInt();
		int reminder=0,quo1=0,quo2=0,quo3=0,flag=0;


		for(int i=(largestNum-1);i>=1;i--)
		{
			reminder = i/10;
			quo1 = i%10;
			quo2 = reminder%10;
			quo3 = reminder/10;

			if((quo1==digit) || (quo2==digit)|| (quo3==digit))
			{
				
				flag=0;
			}
			else
			{
				flag=1;
			}

			if(flag==1)
			{
				System.out.println("The Largest number ="+ i);
				break;
			}			
		}
	}

}
