package functionalinterfacepractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author senthil
 */
public class BiConsumerPractise {

    public static void main(String[] args) {

        BiConsumer<String,Integer> biConsumer = (a,b)->{
            System.out.println("My Name is :: "+a);
            System.out.println("My Age is :: "+b);
        };

        biConsumer.accept("Senthil",100);



    }
}
