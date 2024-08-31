package com.dreamquest.practice.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//
//@Scope("prototype")
//@Component
public class DemoB {

    public void say(){
        System.out.println("Printing from demo class B");
    }

    public void getDemoB()
    {
        System.out.println("Printing the object of demo B: " + this.hashCode());
    }
}
