package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayChallenge {

	public static void main(String[] args) {
			
		int[] numbers = new int[] {1, 2, 0, -3, 2, -5, 9, 8, 1, 0, 7, -6, -6, 4, 0, 0 , -4, -1};

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>0) {
				System.out.print(numbers[i]);
			}
		}
		System.out.println();

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0) {
				System.out.print(numbers[i]);
			}

		}
		System.out.println();

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<0) {
				System.out.print(numbers[i]);
			}
		}
		System.out.println();
		System.out.println();
		Arrays.stream(numbers).forEach(i->{if(i>0) System.out.print(i+",");});
		System.out.println();
		Arrays.stream(numbers).forEach(i->{if(i<0) System.out.print(i+",");});
		System.out.println();
		Arrays.stream(numbers).forEach(i->{if(i==0) System.out.print(i+",");});
		System.out.println();
		System.out.println();

		List<Integer> positiveNumber = new ArrayList<Integer>();
		List<Integer> negativeNumber = new ArrayList<Integer>();
		List<Integer> zero = new ArrayList<Integer>();

		for(int j=0;j<numbers.length;j++) {
			if(Integer.signum(numbers[j])==1) {
				positiveNumber.add(numbers[j]);
			}else if(Integer.signum(numbers[j])==0) {
				zero.add(numbers[j]);
			}else {
					negativeNumber.add(numbers[j]);
			}
		}

		System.out.println(positiveNumber);
		System.out.println(negativeNumber);
		System.out.println(zero);

	}

}
