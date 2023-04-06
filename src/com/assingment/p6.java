package com.assingment;

import java.util.Arrays;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Kids: ");
        int m = sc.nextInt();
        System.out.println("Extra Candies: ");
        int ec = sc.nextInt();
        int[] candies = new int[m];
        System.out.println("The no. of candies each children have: ");
        for (int i = 0; i < m; i++) {
            candies[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(candies));
        boolean[] result = new boolean[m];
       for(int i=0;i<m;i++){
               if(candies[i]+ec>=maximum(candies)){
                  result[i]=true;
           }else{
                   result[i]=false;
               }
     }
        System.out.println(Arrays.toString(result));
  }static int maximum(int[] candies){
       int max= candies[0];
       for(int i=0;i< candies.length;i++){
         if(candies[i]>max){
             max=candies[i];
         }
       }
       return max;
    }
}
