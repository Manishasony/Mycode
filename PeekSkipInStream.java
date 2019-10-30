/**
 * created by manisha
 * sample program using peek(),skip() and forEachOrdered
 */

package PeekandSkip_Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekSkipInStream {
    public static void main(String[]args)
    {
        List<String>number= Stream.of("one","two","three","four","five")
                              .filter(obj->!obj.equals("three"))
                //peek is used to see what is inside the stream
                              .peek(obj->System.out.println("peeked:"+obj))
                               .collect(Collectors.toList());
        System.out.println("after skipping the values the output is");
        IntStream.of(1,3,6,7,10,15)
                 .skip(2)//skip() that skips given number of element from the stream object from start
                  .filter(i->i>5)
                  .forEach(i->System.out.println(i));
        System.out.println("forEachOrdered output");
        Stream.of("monday","tuesday","wednesday","thursday","friday")
               . forEachOrdered(s->System.out.println("result:"+s));//it gives exact ordered of encountered in stream
    }
}
