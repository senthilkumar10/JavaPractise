package week6;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicatesUsingCollections {

	public static void main(String[] args) {

		int array[] = {13,15,67,88,65,67,13,13,99,67,65,13,87,13};
		
		Set<Integer> hash = new TreeSet<Integer>();

		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
					hash.add(array[i]);
			}
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("\n"+hash);

	}

}
