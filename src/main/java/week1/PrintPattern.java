package week1;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
	int a,b;
	System.out.println("Enter the input for A & B :");
	Scanner input = new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
	
	for(int i=a;i<=b;i++)
	{

		if(i%3==0 && i%5==0)
		System.out.print("FIZZBUZZ" +" ");
		else if(i%5==0)
		System.out.print("BUZZ" +" ");
		else if(i%3==0)
		System.out.print("FIZZ" +" ");
		else
		System.out.print(i +" ");
		
	}

	}

}
