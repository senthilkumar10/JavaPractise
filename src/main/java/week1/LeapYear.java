package week1;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter a year to determine is a Leap Year or not = ");
		int leapYear;
		Scanner input = new Scanner(System.in);
		leapYear = input.nextInt();

		if(leapYear%4==0 && leapYear%100!=0)
			System.out.println(leapYear +" is a Leap Year");
		else if(leapYear%100==0 && leapYear%400==0)
			System.out.println(leapYear +" is a Leap Year");
		else
			System.out.println(leapYear +" is not a Leap Year");



	}

}
