package streampractise;

import java.util.Arrays;
import java.util.List;



public class CollectionStringPractise {

	public static void main(String[] args) {
	
		System.out.println(verifyEqualString("pen"));
		System.out.println(verifyEqualString1("pen"));
		
		 int[] array = {23,43,56,97,32};
   	  Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
   	  Arrays.stream(array).reduce(Integer::sum).ifPresent(System.out::println);
		
	}

	
	public static boolean verifyEqualString(String temp) {
		List<String> items = Arrays.asList("pencil","pen","eraser");
		return items.stream()
				.sorted()
				.filter(x->x.equalsIgnoreCase(temp))
				.findAny()
				.isPresent();
	}
			
		public static boolean verifyEqualString1(String temp) {
			List<String> items = Arrays.asList("pencil","pen","eraser");
			return items.stream()
					.anyMatch(x->x.equalsIgnoreCase(temp));
		
		
	}
	
	
}
