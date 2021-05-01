package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author senthil
 */
public class MinMaxPractise {

    public static void main(String[] args) {
        List<String> a = Arrays.asList("Apple","Orange","Lemon","Ball","Mud");

        String min = a.stream()
                      .min(Comparator.naturalOrder())
                      .get();

        System.out.println(min);

        String minReverse = a.stream()
                .min(Comparator.reverseOrder())
                .get();

        System.out.println(minReverse);

        String max = a.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(max);

        String maxReverse = a.stream()
                .max(Comparator.reverseOrder())
                .get();

        System.out.println(maxReverse);

    }

}
