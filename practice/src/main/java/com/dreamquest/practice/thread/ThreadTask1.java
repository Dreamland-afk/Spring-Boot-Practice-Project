package com.dreamquest.practice.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTask1 {

   static  String name="Swapnadeep";
    public static void main(String[] args) throws Exception {

        String simpleName = name.getClass().getSimpleName();


        if(name instanceof String)
            System.out.println(simpleName);

        Thread evenThread = new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0)
                    System.out.println("Even: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread oddThread = new OddThread();

//        evenThread.start();
//        oddThread.start();

        long start = System.currentTimeMillis();

        while (evenThread.isAlive() || oddThread.isAlive()) {
            Thread.sleep(1000);

            if (System.currentTimeMillis() - start > 6000) {
                evenThread.interrupt();
                oddThread.interrupt();
            }
            System.out.println(evenThread.getName() + " is in " + evenThread.getState() + " state");
            System.out.println(oddThread.getName() + " is in " + oddThread.getState() + " state");


        }

        Exception exception = print(2);

        System.out.println(exception);

        List list = new ArrayList();
        list.add("hello");
        list.add(2);
        System.out.print(list.get(0) instanceof Object);
        System.out.print(list.get(1) instanceof Integer);

//        System.out.println(message());

    }

    String message() {
        return "World!";
    }

    String test(){
         return message() + "a";
    }

    static Exception print(int i) {
        if (i > 0) {
            return  new Exception();
        } else {
            throw new RuntimeException();
        }
    }
}
