package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author senthil
 */
public class CollectionStreamPractise {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Apple",
                "Apple",
                "Airplane",
                "Ball",
                "Boy",
                "Cat",
                "Dog",
                "Delta"
        );

        List<String> newList = list.stream()
                                    .filter(i->i.length()>3)
                                    .collect(Collectors.toList());

        System.out.println("Original List :: "+list);
        System.out.println("New List :: "+newList);

        Set<String> newSet = list.stream()
                .collect(Collectors.toSet());

        System.out.println("New set :: "+newSet);

        String joinedString = list.stream()
                                    .collect(Collectors.joining(","));

        System.out.println(joinedString);

        Map<Boolean, List<String>> listMap = list.stream()
                .collect(Collectors.groupingBy(s -> s.startsWith("A")));

        System.out.println(listMap);


        Map<Character, List<String>> characterListMap = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(characterListMap);

    }
}
