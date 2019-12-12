package com.injectingObjectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[]args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("object.xml");
        System.out.println("object.xml file loaded");
        /*
        Both the classes manager and another manager has common dependancies so we create common object in xml with id
        both the classes get dependancies with the reference of id.
         */
       Manager man=context.getBean("manager",Manager.class);
       man.task();
       AnotherManager  manage=context.getBean("anothermanager",AnotherManager.class);
        manage.startTask();


    }
}
