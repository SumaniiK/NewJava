package com.assingment;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 5};
      //  cyclic(arr);
        System.out.println(Arrays.toString(bubble(arr)));
        /*
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] != i) {
                System.out.println("The missing number is: " + i);
            }
        }

         */
    }

    static void selection(int arr) {

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int[] bubble(int[] arr) {
      //  boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
          //  swapped = false;
            //for each step the maximum element come at the last respective index
            for (int j = 1; j <= arr.length - i - 1; j++) {
                //swap if the previous item is greater than this one
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                   // swapped = true;
                }
            }//if it did not swap for the particular value if i that means the array is sorted hence stop the program
           /* if (!swapped) {//!false=true;
                break;
            }

            */
        }
        return arr;
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
