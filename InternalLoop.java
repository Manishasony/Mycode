
/*created by manisha
*forEach method or internal for loop is faster than External for loop
*because it is internal part of collection
 */
package InternalForLoop;
import java.util.*;

public class InternalLoop {
    public static void main(String[]args)
    {
        List<Integer>values=Arrays.asList(4,5,6,7,8);//The asList() method returns a list view of the specified array.
        values.forEach(i ->System.out.println(i) );
    }
}
