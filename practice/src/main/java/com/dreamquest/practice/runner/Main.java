package com.dreamquest.practice.runner;

import com.dreamquest.practice.test.DemoA;
import com.dreamquest.practice.test.DemoB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {

    @Autowired
    DemoA demoA;

    @Autowired
    DemoA demoA1;

    @Autowired
    DemoA demoA2;

//    @Autowired
//    DemoB demoB;
//
//
//    @Autowired
//    DemoB demoB1;
//
//    @Autowired
//    DemoB demoB2;


    int count = 10;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Calling from runner class");
        while (count > 0) {
            System.out.println("......");
            demoA.getDemoBFromA();

            demoA1.getDemoBFromA();

            demoA2.getDemoBFromA();
//            demoB.getDemoB();
//
//            System.out.println(demoB.hashCode());
//
//            System.out.println(demoB1.hashCode());
//
//            System.out.println(demoB2.hashCode());
            count --;
        }
    }
}
