package week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class IntArrayUsingMap {

	public static void main(String[] args) {

	int a[] = {8,9,4,3,3,4,8};
	
	//Declare an empty Map variable
	
	Map<Integer, Integer> storeMap = new HashMap<Integer, Integer>();
	
	for(int i : a)
	{
		if(storeMap.containsKey(i)==false)
		{
			storeMap.put(i, 1);
		}
		else
		{
			Integer count = storeMap.get(i);
			storeMap.put(i, ++count);
		}
	}
	
	System.out.print("The Duplicate Value is = ");

	for(Entry<Integer, Integer> display : storeMap.entrySet()) {
		if(display.getValue()>1)
		{
			System.out.print(display.getKey()+",");
		}
		
		else
		{
			System.out.print("\nThe Unique Value is = ");
			System.out.print(display.getKey());
		}
	}
	
	System.out.println("\nThe Number of Occurances of each Number = ");
	System.out.print(storeMap);
	
	
	
	}

}
