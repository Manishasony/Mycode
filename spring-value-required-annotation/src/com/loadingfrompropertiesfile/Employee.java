/**
 * created by manisha
 * here i used @Value annotation for injecting values from properties file
 * and the @Required annotation is used that the value is mandatory if we are not injecting it gives error
 */
package com.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
   @Value("${employee.name}")//no need to generate setter when we are putting annotatin before the field
    private String name;
    @Value("${employee.field}")
    private String field;
     private int id;
@Required  //this annotation is used that the value is mandatory
@Value("employee.id")
    public void setId(int id) {
        this.id = id;
    }

    public void displayinfo()
    {
        System.out.println("Employee name is"+name );
        System.out.println(  "employee id is:"+id);
        System.out.println( "employee is working on the field is"+field);
    }
}
