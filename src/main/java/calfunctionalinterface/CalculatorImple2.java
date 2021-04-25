package calfunctionalinterface;

/**
 * @author senthil
 */
public class CalculatorImple2 {

    public static void main(String[] args) {

        MathOperation add = (a,b)->a+b;
        MathOperation sub = (a,b)->a-b;
        MathOperation mul = (a,b)->a*b;
        MathOperation div = (a,b)->a/b;


        int onScreenNumber = 0;

        onScreenNumber = calculate(5,add,2);
        onScreenNumber = calculate(onScreenNumber,sub,3);
        onScreenNumber = calculate(onScreenNumber,mul,7);
        onScreenNumber = calculate(onScreenNumber,add,2);
        onScreenNumber= calculate(onScreenNumber,div,3);
        System.out.println(onScreenNumber);
    }

    public static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber){
        return mathOperation.operate(onScreenNumber,enteredNumber);
    }


}
