package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author senthil
 */
public class EvenSquares {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        //Traditional Approach
        List<Integer> evenNumSquares = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                evenNumSquares.add(list.get(i)*list.get(i));
            }
        }

        System.out.println(evenNumSquares);



        list.stream()
                .peek(i-> System.out.println("Filter Received :: "+i))
                .filter(x->x%2==0)
                .limit(3)
                .peek(i-> System.out.println("Map Received :: "+i))
                .map(i->i*i)
                .forEach(System.out::println);


    }



}
