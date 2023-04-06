package com.assingment;

import java.util.*;

public class even_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size  of the array: ");
        int m=sc.nextInt();
        int [] num4=new int[m];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<m;i++){
            num4[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(num4));
        System.out.println("The minimum value in the array Num4 is: "+min(num4));
      //  int n=0;
        for(int i=0;i<m;i++){
            int n=0;
            while(num4[i]>0){
                num4[i]=num4[i]/10;
                n++;
            }
            if(n%2==0){
                System.out.println("the even no. is in index "+i);
            }
        }
    }
    static int min(int []num4){
        int ans=num4[0];
        for (int j : num4) {
            if (j < ans) {
                ans = j;
            }
        }
        return ans;
    }
}
