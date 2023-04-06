package com.company;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class cwh_46_constructors_inheritance {
    public static void main(String[] args) {
        /* company.Base1 b = new company.Base1();
         company.Derived1 d = new company.Derived1();
        company.Derived1 d = new company.Derived1(14);
         company.ChildOfDerived cd = new company.ChildOfDerived();*/
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}

