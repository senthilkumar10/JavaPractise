package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author senthil
 */
public class FlatMapPractise {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(4,5,6);
        List<Integer> c = Arrays.asList(7,8,9);

        List<List<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        //without Flat Map

        list.stream()
                .forEach(System.out::println);

        //with Flat Map
        System.out.println("*********");

        list.stream()
                .flatMap(i->i.stream())
                .forEach(System.out::println);


    }

}
