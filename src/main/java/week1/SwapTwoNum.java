package week1;

import java.util.*;

public class SwapTwoNum {

	public static void main(String[] args) {
	int firstNum, secondNum;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the First Number = ");
	firstNum = input.nextInt();
	System.out.println("Enter the Second Number = ");
	secondNum = input.nextInt();
	
	//Print before Swap
	
	System.out.println("The First Number before Swap = " + firstNum);
	System.out.println("The Second Number before Swap = " + secondNum);
	
	//Swap the Numbers
	
	firstNum = firstNum + secondNum;
	secondNum = firstNum - secondNum;
	firstNum = firstNum - secondNum;
	
	//Print After Swap
	
	System.out.println('\n'+"The First Number After Swap = " + firstNum);
	System.out.println("The Second Number After Swap = " + secondNum);
	

	}

}
