package week3;

import java.util.Scanner;

public class ValidPassword {

	public static void main(String[] args) {
	
		String pass;
		System.out.println("Enter the password to verify it matches the rules");
		Scanner input = new Scanner(System.in);
		pass=input.next();
		ValidPassword obj1 = new ValidPassword();
		obj1.verifyPassword(pass);
	}
	
	public void verifyPassword(String password)
	{
		int digits=0,letters=0,caps=0;
		
	//A password must be at least ten characters
		int len = password.length();
		if(len>=10)
			System.out.print("");
		else
			System.out.println("A password must be at least ten characters");
		
	//A password consists of only letters and digits
		
		boolean a = password.matches("[a-zA-Z0-9]+");
		if(a==true)
			System.out.print("");
		else
			System.out.println("A password should consists of only letters and digits");
	
	//A password must contains two digits and two letters
		
		for(int i=0;i<len;i++)
		{
			boolean r1 = String.valueOf(password.charAt(i)).matches("[a-zA-Z]");
			boolean r2 = String.valueOf(password.charAt(i)).matches("[0-9]");
			if(r1==true)
			letters++;
			if(r2==true)
			digits++;
		}
		
		if(digits>=2)
			System.out.print("");
		else
			System.out.println("A password should contains at least two digits");
		
		if(letters>=2)
			System.out.print("");
		else
			System.out.println("A password should contains at least two letters");
		
		//A password must contain at least one capital letter
		
		for(int j=0;j<len;j++)
		{
			boolean r1 = String.valueOf(password.charAt(j)).matches("[A-Z]");
			if(r1==true)
			caps++;
		}
		
		if(caps>=1)
			System.out.print("");
		else
			System.out.println("A password must contain at least one capital letter");
	
		
		
	}
}
