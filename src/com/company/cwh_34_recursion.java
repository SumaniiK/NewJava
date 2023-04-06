package com.company;

import java.util.Scanner;

public class cwh_34_recursion {
    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        System.out.println("The " + n + "th term of fibonacci series is: " + fib(n));
    }
}





