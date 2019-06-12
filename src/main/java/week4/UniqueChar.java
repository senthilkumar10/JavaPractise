package week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		
		System.out.println("Enter a String to print only unique char = ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();//Getting the input
		String str1 = str.replaceAll(" ", ""); //Removing spaces
		String str2 = ""; //Declaring this variable to store the unique char
		System.out.print("The unique string is = "+str1.charAt(0)); //Printing the first char
		int inc=2; //This variable for Substring
		for(int i=1;i<str1.length();i++)//This loop is to take from the 2nd char
		{
			int t=1,flag=0;
			String ch=str1.substring(i, inc);
			for(int j=0;j<=i;j++) //This loop is to compare the char from 1st loop
			{
				String split = str1.substring(j, t);
				if(ch.equalsIgnoreCase(split)==true)//if it is matching the increment the loop
				{
					flag++;
				}
				t++;
			}
			if(flag==1)//if the char is not more than one time and concate
			{
				str2=str2+ch;
			}
			inc++;
		}
		System.out.print(str2);	//Print the unique char
		input.close();
		
		
	}
}
