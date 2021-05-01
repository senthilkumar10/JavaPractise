package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author senthil
 */
public class FileNameAssignment {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/file-names.txt");
        List<String> allNamesList = Files.readAllLines(path);

        //Print the count of names starts with B


        long count = allNamesList.stream()
                .filter(name -> name.startsWith("B"))
                .count();

        System.out.println("Count of Names starts with B :: "+count);

        //Create a list of names starts with C and contains 's' in it


        List<String> stringList = allNamesList.stream()
                .filter(name -> name.startsWith("C"))
                .filter(name -> name.toLowerCase().contains("s"))
                .collect(Collectors.toList());

        System.out.println(stringList);
        System.out.println(stringList.size());

        //Print the total number of characters for all the names starts with M [Mary,Mike = 8]

        int sum = allNamesList.stream()
                .filter(name -> name.startsWith("M"))
                .map(String::trim)
                .map(name->name.length())
                .mapToInt(a->a)
                .sum();
        System.out.println(sum);

        //Jo-Ann = Jo Ann
        //Find the names containing - in it and replace the - with space and collect them into a list
        List<String> replaceDashList = allNamesList.stream()
                .filter(name -> name.contains("-"))
                .map(name -> name.replace("-", " "))
                .collect(Collectors.toList());

        System.out.println(replaceDashList.size());

        //Find the name which has more number of characters

        String moreChar = allNamesList.stream()
                .max(Comparator.comparing(s->s.length()))
                .get();

        System.out.println(moreChar);


    }

}
