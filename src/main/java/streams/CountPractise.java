package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author senthil
 */
public class CountPractise {

    public static void main(String[] args) {
        List<String> a = Arrays.asList("Apple","Orange","Lemon","Ball","Mud");

        System.out.println(
                a.stream()
                    .filter(i->i.length()>3)
                    .count()

        );


    }

}
