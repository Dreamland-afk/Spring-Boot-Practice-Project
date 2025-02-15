package com.dreamquest.practice.thread;

public class ThreadClass {

    public static void main(String[] args) throws InterruptedException {

        Thread myThread = new Thread(() -> {
            System.out.println("#################");
            System.out.println("Printing results for myThread ");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " State: " + Thread.currentThread().getState());
                System.out.print(". ");
                try {
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("is interrupted myThread? "+Thread.currentThread().isInterrupted());
                    System.out.println(Thread.currentThread().getName() + " is interrupted....");
                    System.out.println("interrupted: "+Thread.currentThread().getName() + " State: " + Thread.currentThread().getState());
                    return;
                }
            }

            System.out.println();
            System.out.println("###################");
        });

        Thread installThread = new Thread(()->{

            for(int i =1; i<=3;i++)
            {
                System.out.println("Installation step: "+i + " Completed");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread monitoringThread = new Thread(()->{

            long start = System.currentTimeMillis();

            while(myThread.isAlive()){

                try {
                    Thread.sleep(1000);
                    System.out.println(myThread.getName() + " State: " + myThread.getState());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if(System.currentTimeMillis() - start > 6000)
                    myThread.interrupt();

            }
        });

        myThread.start();
        monitoringThread.start();

        myThread.join();

        if(!myThread.isInterrupted())
        {
            System.out.println("myThread is not interupted but according to the code it should have");
            System.out.println("is alive myThread? "+myThread.isAlive());
            System.out.println("is interrupted myThread? "+myThread.isInterrupted());

            installThread.start();
        }
    }
}
