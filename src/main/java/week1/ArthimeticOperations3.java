package week1;

import java.util.Scanner;

public class ArthimeticOperations3 {

	public static void main(String[] args) {
		System.out.println("Please type any one of the Following Arthimetic Operations" + '\n'+ "1) Addition" + '\n'+ "2) Substraction" + '\n'+ "3) Multiplication" + '\n'+ "4) Division");
		String arthimeticOps;
		Scanner getStrInput = new Scanner(System.in);
		arthimeticOps = getStrInput.next();
		System.out.println("Enter the First Value");
		Scanner getInput = new Scanner(System.in);
		int input1 = getInput.nextInt();
		System.out.println("Enter the Second Value");
		int input2 = getInput.nextInt();
		switch (arthimeticOps.toLowerCase())
		{
		case "addition":
			System.out.println('\n'+"The sum of two digits are = " + input1+input2);
			break;

		case "substraction":
			System.out.println('\n'+"The Subtraction of two digits are = " + (input1-input2));
			break;

		case "multiplication":
			System.out.println('\n'+"The Multiplication of two digits are = " + input1*input2);
			break;

		case "division":
			System.out.println('\n'+"The Division of two digits are = " + input1/input2);
			break;

		default:
			System.out.println("Invalid Input");
			break;



		}

	}
}
