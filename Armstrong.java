/*created by manisha
Armstrong number is a number that is equal to sum of the cube of its digit
 */
package ArmstrongNumber;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int num, sum = 0, rem, temp;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
        num = obj.nextInt();
        temp = num;//storing our number in temp variable
        /* this while loop executes until number greater than zero
         */
        while (num > 0) {
            rem = num % 10;    //number's remainder stored in rem
            sum = sum + rem * rem * rem; //armstrong number logic
            num = num / 10;  //it will  take rest of the number
        }
        if (sum == temp)    //checks the sum and number are equal
        {
            System.out.println("given number is armstrong");
        }
        else
            {
            System.out.println("not an armstrong number");
        }
    }
}
