package com.usingBeanAnnotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Management {
    public static void main(String[]args)
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
       College college= context.getBean("collegeBean",College.class);
       System.out.println("college obeject created");
       college.test();
       context.close();
    }
}
