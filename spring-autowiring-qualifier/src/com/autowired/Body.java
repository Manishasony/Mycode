package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Human obj= context.getBean("human",Human.class);
       obj.startPumping();

    }
}
