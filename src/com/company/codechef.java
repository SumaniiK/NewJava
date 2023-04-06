package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
public class codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int p1=1*(100-m);
            int p2=2*(100-n);
            if(p1>p2){
                System.out.println("Second");
            }
            if(p2>p1){
                System.out.println("first");
            }else{
                System.out.println("both");
            }
        }
    }
}