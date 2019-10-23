/*created by manisha
* To delete an element in array first traverse array in forward
* if you found the delete element matches with your array element we perform forward shifting
* then the element is deleted or replaced
 */

package DeleteElementInArray;
import java.util.Scanner;
public class DeleteElementInArray {
    public static void main(String[] args) {
        int size, del_element;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:");//getting size of array
        size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter all the elements:");//getting elements of array by using for loop
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element  to delete:");
        del_element = s.nextInt();

        for (int i = 0; i < a.length - 1; i++)//traversing array elements
        {
            if(del_element==a[i])
            {
                //this loop again traverse after the element is deleted and performs forward shifting
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                break;//if elements are shifted no need to traverse outer for loop
            }
        }
        System.out.println("deleted successfully");
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+"");
        }
    }
}
