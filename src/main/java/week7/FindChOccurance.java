package week7;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindChOccurance {

	public static void main(String[] args) {

		String txt = "SenthilSenthilS";
		char[] ch = txt.toLowerCase().toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();

		for (char letter : ch) {

			if(map.containsKey(letter)==false)
			{
				map.put(letter, 1);
			}
			else
			{
				Integer n = map.get(letter);
				map.put(letter, n+1);
			}
		}
		System.out.println(map);
	}

}
