/**
 * created by manisha
 * simple program using Stream intermediate and terminate operations
 */
package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleProgram_StreamMethods {
    public static void main(String[]args)
    {
        List<Integer> values= Arrays.asList(10,5,8,15,24);
        System.out.println(values.stream().filter(i->i%2==0)//it uses test method
                                          .map(i->i*3)//it uses apply method
                                           .findFirst()
                                           .orElse(0));

    }
}
