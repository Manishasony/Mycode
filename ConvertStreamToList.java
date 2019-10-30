/**
 * created by manisha
 * sample pogram to convert Stream to list
 */
package ConvertStreamToList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ConvertStreamToList {



        public static void main(String[] args) {

            Stream<String> language = Stream.of("java", "python", "ruby","php");

            //Convert a Stream to List
           List<String> result = language.collect(Collectors.toList());

            result.forEach(System.out::println);

        }
    }

