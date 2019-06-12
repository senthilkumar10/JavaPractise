package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindDuplicatesUsingArray {

	public static void main(String[] args) {
	
	int[] array = {1,2,4,2,3,4,5,6,7,5};
	int[] result = new int[array.length];
	List<Integer> tree = new ArrayList<Integer>();
	int counter=0;
	
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]==array[j])
			{
				result[counter]=array[i];
				counter++;
				tree.add(array[i]);
			}
		}
	}
	
//	System.out.println(Arrays.toString(result));
	System.out.println(Arrays.toString(array));
	System.out.println(tree);
	
	}

}
