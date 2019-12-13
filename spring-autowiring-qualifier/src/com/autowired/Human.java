package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired
    @Qualifier("humanheart")//what particular object need to inject is specified by qualifier
    private  Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
    public void startPumping()
    {
        System.out.println("name of the animal is "+heart.getNameOfAnimal()+"no of heart"+heart.getNoOfHeart());
        heart.pump();
    }
}
