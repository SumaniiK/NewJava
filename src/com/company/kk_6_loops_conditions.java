package com.company;

import java.util.Scanner;

public class kk_6_loops_conditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
       long num=sc.nextLong();
        System.out.println("Enter the number you want to check : ");
       int n= sc.nextInt();
       int m=0;
       while(num>0){
           long i=num%10;
           if(i==n){
              m++;
           }num=num/10;
       }
       System.out.println("The number of times " +n+ " present in given Number is " +m);
    }
}
