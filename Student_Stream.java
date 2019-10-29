/**
 * created by manisha
 */
package StreamOfStudent;
import java.util.*;
import java.util.stream.Collectors;
 class Student {
    String stud_name;
    String department;
    int year;


     public Student(String stud_name,String department,int year)
    {
        this.stud_name=stud_name;
        this.department=department;
        this.year=year;
    }

     public String getstud_name() {
        return stud_name;
     }
     public void setstud_name() {
         this.stud_name=stud_name;
     }


@Override
     public String toString()
     {
         return(this.stud_name);
     }


 }


public class Student_Stream {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("kavi", "IT", 1),
                new Student("jack", "CS", 2),
                new Student("hema", "BCA", 3));
        Student result = students.stream()


                .filter(p -> "jack".equals(p.getstud_name()))
               .findAny()
               .orElse(null);
        System.out.println("output is:" + result);


    }

}
