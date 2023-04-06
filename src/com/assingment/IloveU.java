package com.assingment;

import java.util.Scanner;

public class IloveU {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter value of n");
    for(int i=0;i<n;i++){
       if(i==0||i==n-1) {
            System.out.println(" ");
        }else{
           for(int j=0;j<n;j++) {
               System.out.println(" ");
           }
           System.out.println("*");
       }

    }

}
}
