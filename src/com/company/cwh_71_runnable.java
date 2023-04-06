package com.company;
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
       int i=0;
        while(i<=50){
        System.out.println("I Am thread 1 ");
        i++;
        }
    }
}
class MyThreadRunnable implements Runnable{
        @Override
        public void run() {
            int i=0;
            while(i<=50){
            System.out.println("I Am thread 2 of runnable2");
            i++;}
        }
    }

public class cwh_71_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 MT=new MyThreadRunnable1();
        Thread R1= new Thread(MT);
        MyThreadRunnable MT2=new MyThreadRunnable();
        Thread R2= new Thread(MT2);
        R2.start();
        R1.start();
    }
   }
