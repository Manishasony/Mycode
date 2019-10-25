/**
 * created by manisha
 *
 */
package StreamExample;

import java.util.Arrays;
import java.util.List;

public class StreamExampleProgram {
    public static void main(String[]args)
    {
        List <String>people= Arrays.asList("sameena","harish","dharani","sameeksha","surekha");
        people.stream().filter(p->p.startsWith("s")).forEach(p->System.out.println(p));


    }
}
