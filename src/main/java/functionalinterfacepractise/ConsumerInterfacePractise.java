package functionalinterfacepractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfacePractise {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java 8");
        list.add("Functional Interface Practise");
        list.add("Consumer Interface Practise");

        Consumer<String> stringConsumer = x-> System.out.println(x);

        list.forEach(stringConsumer);

        list.forEach(x-> System.out.println(x.toUpperCase()));


        Consumer<String> toLower = (s) -> {
            System.out.println(s.toLowerCase());
        };

        Consumer<String> toUpper = (s) -> {
            System.out.println(s.toUpperCase());
        };

        toLower.andThen(toUpper).accept("Test");

    }
}
