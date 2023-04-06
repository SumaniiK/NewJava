package com.company;

import java.util.Scanner;
public class cwh_35_practice_set_on_methods {
   /* static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
    public static void main(String[] args) {
        int i=7;
        System.out.println("the table of "+ i+" is:");
        table(7);
    }

    //problem 2

     static void pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       }

    public static void main(String[] args) {
        int n=6;
        pattern(n);
    }
    //problem 3

    static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        }return 0;
    }

    public static void main(String[] args) {
        int x=100;
        System.out.println("the sum of first "+x+" natural number is: "+sum(x));
    }

    //problem 4

    static void pattern(int n) {
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=6;
        pattern(n);
}  */

    static void temperature(float c){
        float i;
        i=((c*9)/5)+32;
        System.out.println(c+" celsius = "+i+" fahrenheit");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("write temperature in celsius: ");
        float x =sc.nextFloat();
        temperature(x);
    }

    public static class practice2 {
        public static void main(String[] args) {
           // String name=" Sumani is a  good    girl  ";
            //System.out.println(name.indexOf("  "));;
            //System.out.println(name.indexOf("   "));
    //problem 2
            String myletter="Dear Harry\n\tThis java course is nice.\nThanks!";
                    System.out.println(myletter);
        }
    }
}


