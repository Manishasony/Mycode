package com.spring.ioc;

public class Airtel implements Sim {


    @Override
    public void call() {
        System.out.println("calling using airtel sim");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using airtel sim");

    }
}
