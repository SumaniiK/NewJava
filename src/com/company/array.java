package com.company;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* int []marks={23,67,84,98,31,69,37};
        int m= sc.nextInt();
        boolean isInArray = false;
        for(int element:marks){
            if(m==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the company.array");
        }
        else{
            System.out.println("The value is not present in the company.array");
        }*/

        //practice problem 3
   /*     int []marks={23,67,84,98,31,69,37};
        float sum=0;
        for(int element:marks){
            sum=sum+element;
        }
        System.out.println("the avg marks or students in physics");
        System.out.println(sum/marks.length);*/

        //practice problem 4:create a java programme to add two matrices of size 2X3
        /*// Practice Problem 4
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }*/

      /*  // Practice Problem 5
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");}*/

       //practice problem :6 -find the max element in the company.array

      /*  int []marks={23,67,84,31,199,137};
        int max=marks[0];
        for(int i=0;i< marks.length;i++){
            if (marks[i]>max) {
                max=marks[i];
            }
        }System.out.print(max);*/
        // Practice Problem 7
        boolean isSorted = true;
        int [] arr = {1, 5, 9, 9, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }

    public static class cwh_23_loops {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter value of n");
            int n = sc.nextInt();
            int i;
            /*problem 2
            int sum=0;
            while(i<=2*n){
              sum=sum+i;
             i= i+2;
             }System.out.println("the sum of even numbers is:");
            System.out.println(sum);*/

            /*problem 3
           for(i=1;i<=10;i++){

                System.out.println(n*i);
            }
            System.out.println();*/


            /*problem 4
            for(i=10;i>=1;i--){
                System.out.println(n*i);
            }
            System.out.println();*/


            /*problem 5
            int fact=1;
            for(i=n;i>=1;i--){
                fact=fact*i;

            }
            System.out.println(fact);*/

            /*problem 6
            int fact=1;
             i=n;
            while(i>=1){
                fact=fact*i;
                i--;
            }
            System.out.println(fact);*/


           /* problem 9
           int sum=0;
            for(i=1;i<=10;i++){
                sum=sum+n*i;
            }
            System.out.println(sum);*/


          //for(int i=0; i<10; i++) - Goes from i=0 to i=9
           for(i=1;i<=10;i++){
               System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
        }
    }

    public static class cwh_online_library {
    }

    public static class function {
        public static void main(String []args){
            System.out.println("take input of 5 subjects marks");
            Scanner sc=new Scanner(System.in);
            float m=sc.nextFloat();
            float s=sc.nextFloat();
            float e=sc.nextFloat();
            float h=sc.nextFloat();
            float sst=sc.nextFloat();
            float p= m+s+e+h+sst;
            System.out.println(p);
            float percent=p/5;
            System.out.println("the percentage is here");
            System.out.println(percent);

        }

    }
}

