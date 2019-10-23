/*created by manisha
 *to insert an element in array first we traverse array from the last index upto the position
 * if we find position of element we shift elements to next by next index(forward shifting)
 * after shifting we insert element in array
 */
package InsertElementArray;
import java.util.Scanner;

public class InsertElementInArray {

        public static void main(String[] args)
        {
            int size, pos, element;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter size of array:");//getting size of array
            size= s.nextInt();
            int a[] = new int[size+1];
            System.out.println("Enter all the elements:");//getting elements of array by using for loop
            for(int i = 0; i < size; i++)
            {
                a[i] = s.nextInt();
            }
            System.out.print("Enter the position  to insert element:");
            pos = s.nextInt();
            System.out.print("Enter the element  to insert:");
            element = s.nextInt();
            //traversing array and perform shifting of elements to next by next index
            for(int i = a.length-1; i >= (pos-1); i--)
            {
                a[i] = a[i-1];
            }
            /*if we insert element in position but arrays index postion starts with zero
            *so we subtract 1 from position and insert element
             */
            a[pos-1] = element;
            System.out.print("After inserting:");
            for(int i = 0; i < size; i++)
            {
                System.out.print(a[i]+",");
            }
        }
    }

