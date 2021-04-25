package calfunctionalinterface;

/**
 * @author senthil
 */
public class CalculatorImple1 {

    public static void main(String[] args) {

        MathOperation add = (a,b)->a+b;
        MathOperation sub = (a,b)->a-b;
        MathOperation mul = (a,b)->a*b;
        MathOperation div = (a,b)->a/b;

        System.out.println(calculate(add));
        System.out.println(calculate(sub));
        System.out.println(calculate(mul));
        System.out.println(calculate(div));

    }

    public static int calculate(MathOperation mathOperation){
        int a = 100;
        int b = 50;
        return mathOperation.operate(a,b);
    }


}
