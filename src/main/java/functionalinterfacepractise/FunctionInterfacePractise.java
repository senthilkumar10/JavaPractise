package functionalinterfacepractise;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionInterfacePractise {

	public static void main(String[] args) {

		Map<String, Integer> nameMap = new HashMap<>();
		Integer value = nameMap.computeIfAbsent("Senthil", s -> s.length());
		System.out.println(value);

		Function<Integer, String> intToString = Object::toString;
		Function<String, String> quote = s -> "'" + s + "'";
		Function<Integer, String> quoteIntToString = quote.compose(intToString);

		System.out.println(quoteIntToString.apply(10));


	}

}
