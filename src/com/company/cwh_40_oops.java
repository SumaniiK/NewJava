package com.company;

class  Circle{
   private float r,area,peri;
     void setRadius(float i){
         r=i;
    } void setArea(float a){
        if(a==22*r*r/7){
        area=a;}
        else{
            System.out.println("INVALID area ");
        }
    } void setPeri(float p){
        if(p==2*22*r/7){
        peri=p;}
        else{
            System.out.println("INVALID perimeter");
        }
    } float getRadius(){
        return r;
    }
    float getArea(){
        return area;
    }
    float getPerimeter(){
        return peri;
    }
}
public class cwh_40_oops {
    public static void main(String[] args) {
        Circle cm=new Circle();
        cm.setRadius(7.0f);
        cm.setArea(154.00f);
        cm.setPeri(44.78f);
        System.out.println("Area : "+cm.getArea()+" sq. cm");
        System.out.println("Radius : "+cm.getRadius()+" sq. cm");
        System.out.println("Perimeter : "+cm.getPerimeter()+" sq. cm");
    }
}
