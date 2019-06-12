package streampractise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamPractise {

	/*
	 * Stream Tutorials Link
	 * https://www.youtube.com/watch?v=gpIUfj3KaOc&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
	 * https://github.com/shekhargulati/java8-the-missing-tutorial
	 */

	public static void main(String[] args) throws IOException {

		System.out.println("*******************");
		IntStream
		.range(1, 11)
		.forEach(System.out::print);
		System.out.println();
		System.out.println("*******************");
		IntStream.range(1, 10)
		.skip(5)
		.forEach(x->System.out.print(x));
		System.out.println();
		System.out.println("*******************");
		int sumofRange = IntStream
				.range(1, 5)
				.sum();
		System.out.println(sumofRange);
		System.out.println("*******************");
		Stream.of("Senthil","Priya","Adhvik")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		System.out.println("*******************");
		String[] names = {"Java","Senthil","Priya","Adhvik","MuthuNagai","Meenakshi Sundaram","Vasanthi","Kamal"};
		Stream.of(names)
		.filter(x->x.startsWith("M")||x.startsWith("V"))
		.sorted()
		.forEach(System.out::println);
		System.out.println("*******************");
		//Average of squares of Integer Array
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(x->x*x)
		.average()
		.ifPresent(System.out::println);
		System.out.println("*******************");
		//Stream from List Filter and Print
		List<String> personNames = Arrays.asList("Sheik","Venkat","Saranya","Szymon","Oleg","Senthil");
		personNames.stream()
		.sorted()
		.map(String::toLowerCase)
		.filter(x->x.startsWith("s"))
		.forEach(System.out::println);
		System.out.println("*******************");
		//Stream rows from Text file, sort, filter and print 
		Stream<String> bands = Files.lines(Paths.get("C:\\Users\\Senthil\\Desktop\\Bands.txt"));
		bands.sorted()
		.filter(x->x.contains("TC301"))
		.map(x->x.substring(7))
		.forEach(System.out::println);
		bands.close();
		System.out.println("*******************");
		//reduce to find the longest string
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks"); 

		// The lambda expression passed to 
		// reduce() method takes two Strings 
		// and returns the the longer String. 
		// The result of the reduce() method is 
		// an Optional because the list on which 
		// reduce() is called may be empty. 
		Optional<String> longestString = words.stream() 
				.reduce((word1, word2) -> word1.length() > word2.length()? word1 : word2); 

		// Displaying the longest String 
		longestString.ifPresent(System.out::println); 
	}

}
