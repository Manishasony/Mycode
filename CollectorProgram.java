/**
 * created by  manisha
 * sample program using collector
 */

package CollectorProgram;
import  java.util.*;
import java.util.stream.Collectors;

 class Staff {                           //class

     private String name;
     private int age;
     private double salary;

     public Staff(String name, int age, double salary) {  //constructor
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     public String getname() {
         return this.name;
     }
 }
public class CollectorProgram {               //main class
     public static void main(String[]args)
     {
         List<Staff> staffs = Arrays.asList(       //list of objects
                 new Staff("tamil", 30, 10000.0),
                 new Staff("kalai", 27, 20000.0),
                 new Staff("harish", 33, 30000.0)
         );

         List<String> collect = staffs.stream()     //converting list to stream
                 .map(x -> x.getname())              //mapping
                 .collect(Collectors.toList());      // here collector is used for transforming stream to list
         System.out.println(collect);

     }

}

