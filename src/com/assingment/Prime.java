package com.assingment;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n': ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int c=IsPrime(i);
            if(c!=-1) {
                System.out.println(c);
            }
        }
    }
    static int IsPrime(int n){
        if(n<1){
            return -1;
        }int c=2;
        while(c*c<=n){
            if(n%c==0){
                return -1;
            }
            c++;
        }
        return n;
    }

}
