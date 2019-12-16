package com.configuringWithoutUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Management {
    public static void main(String[]args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.configuringWithoutUsingXml");
       College college= context.getBean("collegebean",College.class);
       System.out.println("college obeject created");
       college.test();
    }
}
