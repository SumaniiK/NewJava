package com.company;

import java.util.Scanner;

public class arraynew {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int[] arr=new int[4];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[1]+arr[3]<=arr[2]){
                System.out.println("Yes");
            }
        }
    }


