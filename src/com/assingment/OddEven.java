package com.assingment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(IsOdd(n));
    }
 private static boolean IsOdd(int n){
        return ((n&1)==1);
    }
}
