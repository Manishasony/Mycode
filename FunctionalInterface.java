
/** created by manisha
 * sample functional interface code
 */
package FunctionalInterface;

interface Functional
{
    void display();
}
public class FunctionalInterface {
    public static void main(String[]arg)
    {
        /**lambda expression only achieved by functional interface becoz it contains only one method
         */
        Functional obj=()->System.out.println("welcome");//lambda expression
        obj.display();
    }

}
