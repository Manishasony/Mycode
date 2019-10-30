/**
 * created by manisha
 * sample program using goupingBy,counting,identity Stream operation
 */
package GroupingBy_countinginStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByStreamProgram {
    public static void main(String[]arg)
    {

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String,Long> output =
                items.stream().collect(

                        Collectors.groupingBy(
                               Function.identity(), //used to store same object as key
                             Collectors.counting())//how many elements are present after stream processing

                );

        System.out.println(output);


    }
    }

