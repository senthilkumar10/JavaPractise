package functionalinterfacepractise;

import java.util.function.Supplier;

/**
 * @author senthil
 * This is to generate Random number using Supplier
 */
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();

        System.out.println(random.get());

        Supplier<Double> random1 = Math::random;

        System.out.println(random1.get());
    }

}
