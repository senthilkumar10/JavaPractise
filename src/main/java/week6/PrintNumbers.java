package week6;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
	
	int a;
	System.out.print("Enter a number to print :: ");
	Scanner input = new Scanner(System.in);
	a=input.nextInt();
	
	//Method 1
	
	System.out.println("Printing Numbers using Method 1");
	
	for(int i=1;i<=a;i++)
	{
		System.out.print(i*111+" ");
	}
	
	System.out.println("\n"+"Printing Numbers using Method 2");
	
	for(int i=1;i<=a;i++)
	{
		System.out.print(String.valueOf(i)+String.valueOf(i)+String.valueOf(i)+ " ");
	}input.close();
	}

}
