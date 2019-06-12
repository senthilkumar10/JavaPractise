package week6;

public class CharOccurance {

	public static void main(String[] args) {

	String input = "Wipro India Limited";
	System.out.println("The String is : "+ "Wipro India Limited");
	int len = input.length();
	int inc=0;
	
	for(int i=0;i<len;i++)
	{
		if(input.charAt(i)=='i' || input.charAt(i)=='I')
		{
			inc++;
		}
	}
	
	System.out.println("The occurance of i in the given String is = "+inc);
	}

}
