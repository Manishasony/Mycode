/*created by manisha
fibonacci program
*/
package Fibonacci;
import java.util.Scanner;

public class Fibo {

    public static void main(String[]arg)
        {
            int a=0,b=0,c=1,n;
            Scanner s=new Scanner(System.in);
            System.out.println("enter number of series:");
            n=s.nextInt();
            System.out.println("fibonacci series are:");
            /*this for loop starts with zero because fibonacci number starts with zero and it iterate upto n number
             */
            for(int i=0;i<=n;i++)
            {
                /*swapping is performed so we get fibonacci series
                 */

                a=b;
                b=c;
                c=a+b;
                System.out.println(a);
            }
        }

    }
