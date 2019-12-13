package com.looseCoupling;

public class HellotuneService implements Service {
    @Override
    public void service() {
        System.out.println("hello tune service activated");
    }
}
