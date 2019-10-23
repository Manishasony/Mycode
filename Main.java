/*created by manisha
 */
package DefaultMethod;
interface Phone
{
    void call();//abstract method

    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void message()//default method
    {
        System.out.println("sent");
    }
}
 class Android  implements Phone
{
    @Override
    public void call() {
        System.out.println("calling");
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Phone p=new Android();
        p.call();
        p.message();
    }
}
