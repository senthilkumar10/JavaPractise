package javapractise;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scan.nextLine();
       
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	
	/*System.out.println("Enter a Sentense :- ");
	Scanner input = new Scanner(System.in);
	String sentense = input.nextLine();
	String wordsOnly = sentense.replaceAll("[^a-zA-Z]+", " ");
	//System.out.println(wordsOnly);
	String[] sep = wordsOnly.split(" ");
	
	for(String w : sep)
	{
		System.out.println(w);
	}
	
	*/
	}

}
