package week7;

import java.util.HashSet;
import java.util.Set;


public class FindUniqueNumbers {

	public static void main(String[] args) {
	
	int[] a = {8,9,4,3,3,4,8};
	
	Set<Integer> array = new HashSet<Integer>();
	
	for (int intra : a) {
		
		array.add(intra);
		
	}
	System.out.println(array);
	
	array.forEach(i -> System.out.println(i));	// Lambda Expression
	}

}
