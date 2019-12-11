package com.spring.ioc;

public class Jio implements Sim {


    @Override
    public void call() {
        System.out.println("calling using jio sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using jio sim");

    }
}
