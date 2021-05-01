package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author senthil
 */
public class FindFirstPractise {

    public static void main(String[] args) {
        List<String> a = Arrays.asList("Apple","Orange","Lemon","Ball","Mud");

        Optional<String> first = a.stream()
                .filter(i -> i.length() > 3)
                .findFirst();


       if(first.isPresent()){
           System.out.println(first.get());
       }

        Optional<String> second = a.stream()
                .filter(i -> i.length() > 30)
                .findFirst();

       // System.out.println(second.get()); //This throw a 'NoSuchElement' Exception. Hence always check isPresent

        if(second.isPresent()){
            System.out.println(second.get());
        }


    }

}
