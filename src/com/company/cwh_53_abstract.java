package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("MAi base2 ka constructor hoon");
    }public void sayHello(){
        System.out.println("Hello");
    }abstract public void greet();
    abstract public void greet2();
}class Child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Evening");
    }
}abstract class Child3{
    public void th(){
        System.out.println("I am Good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        //company.Parent2 p = new company.Parent2();
        Child2 c = new Child2();
        //company.Child3 c3 = new company.Child3();
    }
}
