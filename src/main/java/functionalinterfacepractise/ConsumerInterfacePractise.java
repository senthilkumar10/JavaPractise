package functionalinterfacepractise;

import java.util.function.Consumer;

public class ConsumerInterfacePractise {

    public static void main(String[] args) {
        Consumer<String> toLower = (s) -> {
            System.out.println(s.toLowerCase());
        };

        Consumer<String> toUpper = (s) -> {
            System.out.println(s.toUpperCase());
        };

        toLower.andThen(toUpper).accept("Test");

    }
}
