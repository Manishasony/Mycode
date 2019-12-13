

package com.looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sim {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("coupling.xml");
       Airtel airtel= context.getBean("airtel",Airtel.class);
        airtel.activateService();
    }
}
