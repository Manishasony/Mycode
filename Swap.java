/**
 * created by manisha
 * swaping two numbers without using any third variable
 */
package SwapNumber;
import java.util.Scanner;

public class Swap {
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("before swapping");
        System.out.println("enter first number");
        int a=obj.nextInt();
        System.out.println("enter second number");
        int b=obj.nextInt();
        //swapping logic
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of first after swapping"+a);
        System.out.println("value of second after swapping"+b);
    }
}
