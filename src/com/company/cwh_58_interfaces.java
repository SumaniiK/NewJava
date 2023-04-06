package com.company;

interface sampleInterface{
        void meth1();
        void meth2();
default void greet(){
        System.out.println("i am interface 1");
 }
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
    default void greet2(){
        System.out.println("i am interface 2");
    }
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }

    @Override
    public void greet() {
        childSampleInterface.super.greet();
    }
}
public class cwh_58_interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.greet();

    }
}

