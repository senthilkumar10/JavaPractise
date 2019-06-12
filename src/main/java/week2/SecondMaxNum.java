package week2;

import java.util.Arrays;

public class SecondMaxNum {

	public static void main(String[] args) {

		int[] a = {20,340,21,879,92,21,474,83647,-200};
		Arrays.sort(a);
		int secondMax = a[a.length-2];
		System.out.println(secondMax);

		/*	int temp = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j=1; j < (a.length-i); j++) {
				if(a[j-1] > a[j]) { 
					temp = a[j-1]; 
					a[j-1] = a[j];
					a[j] = temp;

					System.out.println(Arrays.toString(a));
}}}*/
		
		

}}