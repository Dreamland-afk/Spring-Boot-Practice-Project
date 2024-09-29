package com.dreamquest.practice.test;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoA {

//    @Autowired
//    DemoB demoB;

    @Autowired
    private ObjectFactory<DemoB> prototypeBeanFactory;

    public void print()
    {
        System.out.println("Printing from demo class A");
    }

    public void getDemoBFromA()
    {
        System.out.println("Printing the object of demo B from demo A from b : " + prototypeBeanFactory.getObject().hashCode());

    }
}
