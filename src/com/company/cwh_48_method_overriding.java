package com.company;/*
class company.A{
    public void meth1(){
        System.out.println("I am method 1 of class company.A");
    }
}

class company.B extends company.A{

}
public class CWH{
    public static void main(String[] args) {
        company.A a = new company.A();
        a.meth1();

        company.B b = new company.B();
        b.meth1();
    }
}*/

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class company.A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class company.B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class company.B");
    }
}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}


