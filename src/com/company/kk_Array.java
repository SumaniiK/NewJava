package com.company;

import java.util.*;

public class kk_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Array of primitives
       int [] array=new int[6];// declaration and memory allocation
        array[0]=78;
        array[1]=67;
        array[2]=34;
        array[3]=77;
        array[4]=90;
        array[5]=22;


        // method 2:
        /*
        int [] array ={78,67,34,77,90,22}
         */
       System.out.println(array[5]);

        // input using loops
       for(int i=0;i<array.length;i++){
          array[i]=sc.nextInt();
      //  }//System.out.println(Arrays.toString(array));
     //   for(int i=0;i<array.length;i++){
       //     System.out.print( array[i] +" ");
        //}
      //  for(int num:array){
        //    System.out.print(num + " ");
        }
      /*  String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "kunal";

        System.out.println(Arrays.toString(str));

       */

                int[] nums = {3, 4, 5, 12};
                System.out.println(Arrays.toString(nums));
                change(nums);
                System.out.println(Arrays.toString(nums));
            }
            static void change(int[] arr) {
                arr[0] = 99;
    }
}

