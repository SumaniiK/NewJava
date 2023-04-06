package com.company;

//create a class cylinder and use getter and setter to set its radius and height
class Cylinder{
   private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;}
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }

}
public class cwh_44_practice {
    public static void main(String[] args) {
        //problem 1

        Cylinder cy=new Cylinder(4.5f,7.2f);
       /* Scanner sc=new Scanner(System.in);
        System.out.println("enter value of Radius and Height");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        cy.setHeight(y);
        cy.setRadius(x)*/

        System.out.println("The Radius of company.Cylinder is "+ cy.getRadius());
        System.out.println("The Height of company.Cylinder is "+ cy.getHeight());

        //problem 2
        System.out.println("The Volume of company.Cylinder is: "+ cy.volume());
        System.out.println("The Surface Area of company.Cylinder is: " +cy.surfaceArea());



    }
}
