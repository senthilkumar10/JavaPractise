package streampractise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcepts {

    public static void main(String[] args) {

        Predicate<Integer> func = x->x>5;

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collist = list
                .stream().filter(func)
                .collect(Collectors.toList());

        System.out.println(collist);

        //Predicate with &&
        List<Integer> collist1= list
                .stream().filter(x->x>4 && x<10)
                .collect(Collectors.toList());

        System.out.println(collist1);

        //Predicate with ||
        list.stream().filter(x->x>4 || x<10)
                .forEach(System.out::print);


        //Predicate without negate()
        List<String> stringlist = Arrays.asList("Senthil","Senth","Sent","Java","Jav","Ja","J");
        Predicate<String> nameExp = x->x.startsWith("Sent");

        List<String> outputList = stringlist.stream().filter(nameExp).collect(Collectors.toList());
        System.out.println();
        System.out.println(outputList);

        //Predicate with negate()
        List<String> outputList1 = stringlist.stream().filter(nameExp.negate()).collect(Collectors.toList());
        System.out.println(outputList1);


    }
}
