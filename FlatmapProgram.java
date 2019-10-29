/**
 * created by manisha
 *sample program by using flatmap to convert arrays into stream and applying the stream methods
 */
package FlatmapExampleProgram;
import java.util.stream.*;
import java.util.*;

public class FlatmapProgram {
    public static void main(String[]args)
    {
        int[] intArray = {1, 2, 3, 4, 5, 6};

        // Stream<int[]>
        Stream<int[]> streamArray = Stream.of(intArray);

        // Stream<int>
        IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));
        System.out.println(" flatMap() to convert Stream<int[]> to Stream<int>");
        intStream.forEach(x -> System.out.println(x));
        System.out.println(" flatMap() to convert Stream<String[]> to Stream<String>");
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        //Stream<String>
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));


        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);


    }

}

