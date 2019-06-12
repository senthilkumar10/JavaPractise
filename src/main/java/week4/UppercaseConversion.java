package week4;

import java.util.Scanner;

public class UppercaseConversion {

	public static void main(String[] args) {
		System.out.println("Enter a String to convert to Upper Case = ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String upperCase = "";    

		for(int i=0;i<str.length();i++)
		{
			int ascii = str.charAt(i);
			if(ascii>=97 && ascii<=122)
			{
				ascii=ascii-32;
				String a = Character.toString((char)ascii);
				upperCase.concat(a);
				System.out.print(a);
			}
			else if((ascii>=65 && ascii<=90))
			{
				String a = Character.toString((char)ascii);
				upperCase.concat(a);
				System.out.print(a);
			}     
			else if((ascii>=65 && ascii<=90))
			{
				String a = Character.toString((char)ascii);
				upperCase.concat(a);
				System.out.print(a);
			}
			else if((ascii==32))
			{
				String a = Character.toString((char)ascii);
				upperCase.concat(a);
				System.out.print(a);
			}
		}input.close();

	}

}
