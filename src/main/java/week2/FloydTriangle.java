package week2;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
	
	System.out.println("Enter the number of rows that you want to print Floyd Triange = ");
	int a,temp=1;
	Scanner input = new Scanner(System.in);
	a=input.nextInt();
	
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(temp);
			temp++;
		}
		System.out.print("\n");
	}
	

	}

}
