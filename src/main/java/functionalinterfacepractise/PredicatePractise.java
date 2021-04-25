package functionalinterfacepractise;

import java.util.function.Predicate;

/**
 * @author senthil
 */
public class PredicatePractise {

    public static void main(String[] args) {

        Predicate<Integer> isGT2 = n->n>2;
        Predicate<Integer> isLT10 = n->n<10;

        System.out.println(isGT2.test(1));
        System.out.println(isLT10.test(8));
        System.out.println(isGT2.and(isLT10).test(9));


    }
}
