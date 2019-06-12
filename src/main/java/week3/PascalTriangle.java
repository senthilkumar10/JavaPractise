package week3;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows to print Pascal Triangle:");
        int rows = s.nextInt();
        System.out.println("The Pascal Triangle is:");
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows - i; k++) {
                 System.out.print("	 ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
       }
       s.close();		
		}
}

		



