/**
 *created by manisha
 *simple arraylist program using sort method and advanced forloop
 */
package SortingInArrayList;

import java.util.*;
public class Sort {


    public static void main(String args[]) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");
        /*before sorting*/
        System.out.println("Before Sorting:");
        for (String str : arraylist) {
            System.out.println(str);
        }

        /* Sorting in ascending order*/
        Collections.sort(arraylist);

        /* after sorting*/
        System.out.println("ArrayList in sorted order:");
        for (String str : arraylist) {
            System.out.println(str);
        }
    }
}
