package com.assingment;
//Runnable 1-D Array
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the index of Array :");
        int m=sc.nextInt();
        int[] num3=new int[m];
        System.out.println("Enter the element of the Array: ");
        for(int i=0;i<m;i++){
            num3[i]=sc.nextInt();
        }
        System.out.println("The elements odf the Array 'num3' is: "+ Arrays.toString(num3));
        int [] ans3=new int[m];
        for(int i=0;i<m;i++) {
           for (int j = 0; j < m; j++) {
             if(j<=i){
               ans3[i] += num3[j];
           }
             }
        }
        System.out.println("The elements odf the Array 'ans3' is: "+Arrays.toString(ans3));
    }
}
