package com.company;

class Animal{
    double t;
    double features(double i){
        System.out.println("Have a tail");
        System.out.println("Have four legs");
        t=i;
        return i;
    }void language(){
        System.out.println("Can't Speak Human Language");
        System.out.println("Faithful towards their owners");
    }
}
class Dog extends Animal{
    double t;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    void PetAnimal(){
        System.out.println("company.Dog is a pet animal");
    }
    void Bark(){
        System.out.println("Dogs bark at strangers");
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        Animal an=new Animal();
        Dog dg=new Dog();
        dg.PetAnimal();
        dg.Bark();
        dg.setT(6.98);
        dg.features(6.78);
        an.language();
        dg.getT();
    }

}
