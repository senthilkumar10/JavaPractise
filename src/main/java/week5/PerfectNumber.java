package week5;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
	    int a,b=0;
        System.out.println("Enter a +ive number to verify is it a perfect number or not = ");
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        for(int i=1;i<a;i++)
        {
               if(a%i==0)
               {
                     b=b+i;
               }
        }
        if(((b+a)/2)==a)
        {
               System.out.println(a+" is a Perfect Number");
        }
        else
               System.out.println(a+" is not Perfect Number");
        input.close();
	}

}
