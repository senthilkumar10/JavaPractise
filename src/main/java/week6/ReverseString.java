package week6;

public class ReverseString {

	public static void main(String[] args) {

	String input = "Hexaware";
	
	System.out.println("The Original String is : "+"Hexaware");
	int len = input.length();
	System.out.print("The reversed String is : ");
	for(int i=(len-1);i>=0;i--)
	{
		System.out.print(input.charAt(i));
		
	}

	}

}
