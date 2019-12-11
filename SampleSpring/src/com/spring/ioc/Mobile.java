package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
        Jio jio= context.getBean("jio",Jio.class);
       jio.call();
       jio.data();
    }
}
