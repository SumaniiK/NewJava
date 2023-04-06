package com.company;

import java.util.Scanner;

public class cwh_86_practice_set_14 {
    public static void main(String[] args) {
        //problem 1
        //Syntax error
        // a=8;
        //logical error:
    /*    Scanner sc=new Scanner(System.in);
        System.out.println("Enter current year");
        int current_year=sc.nextInt();
        int age = current_year-2000;
        System.out.println(age);
        //runtime error
        System.out.println(age/0);*/

        //problem 2
     /*   Scanner sc=new Scanner(System.in);
        System.out.println("Enter age year");
        int age=sc.nextInt();
        try{
            System.out.println(age/0);
        }catch(ArithmeticException e){
            System.out.println("HaHa..HaHa..");
        }
       catch(IllegalArgumentException e){
           System.out.println("HeHe...HeHe...");
        } */
        //problem 3
        boolean flag=true;
        int[] marks = new int[5];
        marks[0] = 67;
        marks[1] = 56;
        marks[2] = 40;
        marks[3] = 78;
        marks[4] = 32;
        Scanner sc = new Scanner(System.in);
        int index ;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the index: ");
                index = sc.nextInt();
                System.out.println("the value of marks index is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }

        }
    }
}
