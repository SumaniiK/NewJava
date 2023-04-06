package com.company;

class Rectangle{
    public double length; public double breath;

    public Rectangle() {
        System.out.println("I am a non parametrize constructor");
    }Rectangle(double l,double b) {
        System.out.println("I am a parametrize constructor");
        this.length = l;
        this.breath=b;
    }public double area() {
        return length * breath;
    }
}
class Cuboid extends Rectangle{
    public double height;
    public Cuboid(double l,double b,double h) {
        super(l,b);
        System.out.println("I am a non parametrize constructor of class company.Cuboid");
        this.height=h;
    }public double area(){
        return 2*(length*breath+breath*height+length*height);
    }public double Volume(){
        return length*breath*height;
    }
}
/*class Circle1{
    public double radius;
    Circle1(){
        System.out.println("I am a non parametrize constructor");
    }Circle1(double r){
        System.out.println("I am a parametrize constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle1{
    public double height;
    Cylinder1(double r,double h){
        super(r);
        System.out.println("I am a parametrize constructor of Cylinder1");
        this.height=h;
    }
    public double totalArea(){
        return 2*Math.PI*this.radius*(this.radius+this.height);
    }public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}*/
public class cwh_52_practice_problem {
    public static void main(String[] args) {
        //problem 1:create a class circle and inherit the class cylinder in it
      /*  Circle1 cr=new Circle1();
        cr.area();
        Cylinder1 cy=new Cylinder1(7f,3.14f);
        cy.totalArea();
        cy.volume();*/

        //problem 2:Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
        Rectangle rc=new Rectangle(5.2,6.2);
        Cuboid cb=new Cuboid(4.5,5.3,6.1);
        rc.area();
        cb.Volume();
    }
}
