package com.assingment;

import java.util.*;

public class sol {
    public static void main(String[] args) {
      //  int[] nums = {12, 345, 2, 6, 7896};
      //  System.out.println(even(nums));
        int [][] image={ {1,1,0},
                       {0,0,1},
                       {0,0,0} };
        int [][]  matrix = { {1,2,3},{4,5,6} };
        int [][]  m = {{0,1},{1,1}};
        int [][]  t = {{1,0},{0,1}};
       // System.out.println(output2(m,t));
        int[] nums={3,3};
        int target=6;
       // System.out.println(out(nums,target));
       // System.out.println(diagonal(mat));
       // System.out.println(Arrays.deepToString(output(image)));
        //System.out.println(Arrays.toString(ans(9)));
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2=bubble(arr);
        int sum = 0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>=0)
                sum+=arr2[i];
        }
        System.out.println(sum);
       }
    static int[] bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - i - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
       static int[] ans(int n){
           int[] A=new int[n];
           int i=0;
           Random rd=new Random();
           int C=rd.nextInt(15);
           if(n%2!=0){
               A[i]=0;
               i++;
           }
           while(i<n){
               A[i]=C;
               A[i+1]=-C;
               i=i+2;
               C++;
           }
           return A;
       }


    static boolean output2(int[][] m, int[][] t){
        BitSet r = new BitSet(4);//4 bits for each rotation, i bit false -> i rotation equals to m
        for (int i = 0, n = m.length - 1; i < m.length; i++)
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != t[i][j]) r.set(0, true);
                if (m[i][j] != t[j][n - i]) r.set(1, true);
                if (m[i][j] != t[n - i][n - j]) r.set(2, true);
                if (m[i][j] != t[n - j][i]) r.set(3, true);
            }
        return r.cardinality() != 4;
    }
    static int even(int []nums){
        int m=0;
        for (int num : nums) {
            int n = num;
            int count = 0;
            while (n > 0) {
                count++;
                n = n / 10;
            }
            if (count % 2 == 0) {
                m++;
            }
        }
        return m;
    }
    static int diagonal(int[][] mat){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    static int[][] output(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int t = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = t;
            }
        }
        System.out.println(Arrays.deepToString(image));
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
    static int[] out(int[] nums,int target){
        int[] B=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    B[0]=i;
                    B[1]=j;
                }
            }
        }
        return B;

    }
}






