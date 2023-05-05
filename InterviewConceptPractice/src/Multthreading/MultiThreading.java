package Multthreading;

public class MultiThreading {

    public static void main(String[] args) {

        Thread thread1 = new Thread1();
        thread1.setPriority(10);
//        thread1.start();

        //thread 2
        Thread thread2 = new Thread(new Thread2());
//        thread2.start();

        //implement the runnable using lambda as it's a functional interface
        Thread thread3 = new Thread(()->{
            for(int i = 0;i<100;i++){
                System.out.println("using lambda: "+i);
            }
        });
        thread3.start();
        System.out.println("main");


        System.out.println("exiting main");
    }

}
