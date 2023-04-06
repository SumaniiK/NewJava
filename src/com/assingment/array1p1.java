package com.assingment;

import java.util.*;

public class array1p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array Nums: ");
       int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter elements of array Nums: ");
        for(int i=0; i<nums.length;i++){
            nums[i]=sc.nextInt();
        //    System.out.print( nums[i] +" ");
        }System.out.println("The elements odf the Array 'num' is: "+Arrays.toString(nums));
        int [] ans=new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
           // System.out.print(ans[i]+" ");
        }
        System.out.println("The elements odf the Array 'ans' is: "+Arrays.toString(ans));
    }
}
