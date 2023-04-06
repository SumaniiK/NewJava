package com.assingment;

import java.util.Arrays;
import java.util.Scanner;
//2n element:shuffle Array
public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size  of the array: ");
        int m=sc.nextInt();
        int [] num2=new int[2*m];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<2*m;i++){
            num2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(num2));
        int[]num21=new int[m];
        for(int i=0;i<m;i++){
            num21[i]=num2[i];
        }  System.out.println(Arrays.toString(num21));
        int[]num22=new int[m];
        for(int i=0;i<m;i++){
            num22[i]=num2[m+i];
        }
        System.out.println(Arrays.toString(num22));
        int[]new_num=new int[2*m];
        for(int i=0;i<2*m;i++){
            if(i%2!=0){
                new_num[i]= num22[i/2];
            }else{
                new_num[i]=num21[i/2];
            }
        }
        System.out.println("The new Array is: "+Arrays.toString(new_num));
    }
}
