/**
 * created by manisha
 * sample program using Optional class methods
 */

package OptionalClass;
import java.util.Arrays;
import java.util.Optional;
public class OptionalClassExample {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[3] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        Optional<String> checkValue = Optional.ofNullable(str[3]);
        checkValue.ifPresent(System.out::println);   // printing value by using method reference
        System.out.println(checkValue.get());    // printing value by using get method
        System.out.println(str[3].toLowerCase());
    }
}

