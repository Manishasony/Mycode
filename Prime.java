/*created by manisha
this program checks whether the given number is prime or not
 */

package PrimeNumber;
import java.util.Scanner;

public class Prime {
    public static void main(String[] arg) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        num = sc.nextInt();
        /*
        this loop checks the number divisable count is 2 or not.if the count is 2 then it is prime number
         */
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("the given number " + num + "is prime ");
        } else {
            System.out.println("not an prime number");
        }
    }
}
