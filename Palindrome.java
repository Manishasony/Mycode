/*@author_manisha
palindrome number is a number that remains same when its digits are reversed
 */

package PalindromeNumber;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[]arg)
    {
        int num, sum = 0, re, temp;
    Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
         num = obj.nextInt();
       temp = num;//storing our number in temp variable
    /* this while loop executes until number greater than zero
     */
        while (num > 0) {
        re = num % 10;    //reversing a number logic
        sum = (sum *10)+re;
        num = num / 10;
    }
        if (sum == temp)    //checks the sum and number are equal
    {
        System.out.println("given number is palindrome");
    }

        else
    {
        System.out.println("not an palindrome number");
    }
}
}



