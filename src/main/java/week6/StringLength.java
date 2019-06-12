package week6;

public class StringLength {


	public static void main(String[] args) {

	//Method 1 using index of

	String text = "Amazon Development Centre";
	String textcon = text+"\n";
	
	System.out.println("Finding Length using Method 1 = " + textcon.indexOf("\n"));
	
	//Method 2 using Character array with While Loop
	
	char[] array = textcon.toCharArray();
	int inc=0;
	
	while(array[inc]!='\n')
	{
		inc++;
	}
	
	System.out.println("Finding Length using Method 2 = "+inc);
	
	//Method 3 using try catch block
	int i = 0;
	
	try {
		for(i=0;;i++)
		{
		 text.charAt(i);	
		}
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println("Finding Length using Method 3 = "+i);
	}
	
	//Method 4 last index of 
		
	System.out.println("Finding Length using Method 4 = "+textcon.lastIndexOf("\n"));
	
	//Method 5 using For each
	int count=0;
	for(char arr : array)
	{
		if(arr!='\n')	
		count++;
	}
	
	System.out.println("Finding Length using Method 5 = "+count);

}
}
