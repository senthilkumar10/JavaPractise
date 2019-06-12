package week5;

import java.util.Scanner;

public class PrintNumberCombination {

	public static void main(String[] args) {
	
		System.out.println("Enter a 3 digit number to print the combinations");
		String nbr;
		Scanner input = new Scanner(System.in);
		nbr = input.nextLine();
		String fset = nbr.substring(1, 3);
		String mset = nbr.substring(2).concat(nbr.substring(0, 1));
		String lset = nbr.substring(0, 2);

		printCombination(nbr.substring(0, 1),fset);
		printCombination(nbr.substring(1, 2),mset);
		printCombination(nbr.substring(2),lset);
		input.close();
	}

	public static void printCombination(String str,String inputNbr1)
	{
		System.out.print(str);   
		for(int j=0;j<inputNbr1.length();j++)
		{
			System.out.print(inputNbr1.charAt(j));
		}
		System.out.println();
		System.out.print(str);
		for(int i=(inputNbr1.length()-1);i>=0;i--)
		{
			System.out.print(inputNbr1.charAt(i));
		}
		System.out.println();
	}
}


/*
 * Code from Bharathi	
 * int[] input = { 1, 2, 3 };
		 
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
 
                    if (x != y && y != z && z != x) {
                        System.out.println(input[x] + "" + input[y] + ""
                                + input[z]);
                    }
                }
            }
        }

 */

