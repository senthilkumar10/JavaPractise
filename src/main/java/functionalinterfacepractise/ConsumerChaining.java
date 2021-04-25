package functionalinterfacepractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author senthil
 */
public class ConsumerChaining {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java 8");
        list.add("Functional Interface Practise");
        list.add("Consumer Interface Practise");

        Consumer<String> writeInDB = x-> System.out.println("Entered in DB ::"+x);
        Consumer<String> writeInLog = x-> System.out.println("Entered in Log ::"+x);
        Consumer<String> writeInDBLog = writeInDB.andThen(writeInLog);

        list.forEach(writeInDBLog);

        //Based on the input at runtime, it choose the function

        Map<String,Consumer<String>> map = new HashMap<>();
        map.put("DB",writeInDB);
        map.put("Log",writeInLog);
        map.put("Both",writeInDBLog);

        list.forEach(map.get("Log"));


    }

}
