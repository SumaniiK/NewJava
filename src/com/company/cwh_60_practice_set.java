package com.company;

//problem 1
/*abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("writing...");
    }

    @Override
    void refill() {
        System.out.println("please fill the pen");
    }

    void ChangeNib(){
        System.out.println("Change the Nib of the pen");
    }
}
public class company.cwh_60_practice_set {
    public static void main(String[] args) {
        FountainPen fp=new FountainPen();
        fp.write();
        fp.ChangeNib();
        fp.refill();
    }
}*/
//problem 2
class Monkey{
    void jump(){
        System.out.println("can jump high");
    }
    void bite(){
        System.out.println("have strong teeth for biting");
    }
}interface BasicAnimal{
    void eat();
    void sleep();
}class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep..");
    }
    void speak(){
        System.out.println("Hello Sir!");
    }
}public class cwh_60_practice_set {
    public static void main(String[] args) {
        Human hm=new Human();
        hm.eat();
//        hm.bite();
//        hm.jump();
        Monkey mn=new Human();
        mn.jump();
        mn.bite();
  }
}
//problem 3
/*abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}class SmartTelePhone extends Telephone{
    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("lifting phone");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting...");
    }
}public class company.cwh_60_practice_set {
    public static void main(String[] args) {
        SmartTelePhone tpt=new Telephone();
    }*/