/**
 * created by manisha
 */

package ParrallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee implements Comparable<Employee>
{
    String name;
    int experience;
    int salary;
    Employee(String name,int experience,int salary)
    {
        name=this.name;
        experience=this.experience;
        salary=this.salary;
    }

    public int getsalary() {
        return this.salary;
    }
    public void setSalary(int salary)
    {
        this.salary= salary;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    public String toString()
    {
        return this.name + " - " + this.salary;
    }

    public int compareTo(Employee another)
    {
        return another.getsalary() - this.salary;
    }

}

public class ParrallelStreamExample  {
    public static void main(String[]args)
    {
        List<Employee>details= Arrays.asList(
                new Employee("ravi",4,40000),
                new Employee("sangeetha",3,30000),
                new Employee("sanjay",2,25000),
                new Employee("harshini",1,17000),
                new Employee("ragini",0,1500));



        details.parallelStream()
                .filter(e->e.getsalary()>=10000)
                .sorted()
                .forEach(System.out::println);
        System.out.println("......................................");
      /*  details.stream().sorted().parallel()
                .filter(s -> s.getsalary() >= 10000)
                .forEach(System.out::println);

       */
    }
}






