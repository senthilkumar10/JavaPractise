package calfunctionalinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author senthil
 */
public class CalculatorImple3 {

    public static Map<String,MathOperation> mathOperationMap = new HashMap<>();

    static{
        mathOperationMap.put("+",(a,b)->a+b);
        mathOperationMap.put("-",(a,b)->a-b);
        mathOperationMap.put("*",(a,b)->a*b);
        mathOperationMap.put("/",(a,b)->a/b);
    }

    public static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber){
        return mathOperation.operate(onScreenNumber,enteredNumber);
    }

    public static int calculate(String expression){
        String[] exps = expression.split(" ");
        int onScreenNumber = Integer.parseInt(exps[0]);

        for (int i = 1; i < exps.length; i=i+2) {
            MathOperation mathOperation = mathOperationMap.get(exps[i]);
            int enteredNumber = Integer.parseInt(exps[i+1]);
            onScreenNumber = calculate(onScreenNumber,mathOperation,enteredNumber);
        }
        return onScreenNumber;
    }

    public static void addOperation(String Key, MathOperation mathOperation){
        mathOperationMap.put(Key,mathOperation);
    }

    public static void main(String[] args) {

        String tc1 = "5 + 2 - 3 * 7 + 2 / 3";
        String tc2 = "10 / 2 * 3 - 3 / 3 * 5";
        String tc3 = "9 * 9 - 1 * 7 / 8 + 30";

        System.out.println(calculate(tc1));
        System.out.println(calculate(tc2));
        System.out.println(calculate(tc3));

        String tc4 = "9 * 9 - 1 * 7 / 8 + 30 ^ 2";
        addOperation("^",(a,b)-> (int) Math.pow(a,b));
        System.out.println(calculate(tc4));

    }




}
