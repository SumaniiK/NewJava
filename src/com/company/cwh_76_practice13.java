package com.company;
class problem1a extends Thread{
    public void run() {
        while(true){
            try{
                Thread.sleep(40);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}class problem1b extends Thread{
public void run() {
    while(true){
        try{
        Thread.sleep(4);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Welcome");
   }
 }
}
public class cwh_76_practice13 {
    public static void main(String[] args) {
        problem1a p1=new problem1a();
        problem1b p2=new problem1b();
        p1.setPriority(3);
        p2.setPriority(4);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
