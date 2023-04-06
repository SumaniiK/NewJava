package com.assingment;

import java.util.*;

public class solution {
    public static void main(String[] args) {
     /*  Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
       // String sen=sc.next();
        //String se9n1=sen.trim();
        String sen2=sc.next();
       // String sen2="leetcode";
        String finsen=remove(sen2);
        System.out.println(finsen);
        if(finsen.length()==26){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

      */int[] sorts={-5,-1,0,9,53,87,90};
        int i=0;
       // System.out.println(sorted(sorts,i));
       // System.out.println(outp(nums));
        int n=8;
        int sq=(int)Math.sqrt(n);
      //  System.out.println(sq);
        Random rd=new Random(70);
        System.out.println(guessNumber(rd.nextInt()));
       // answ(n);

    }public static int guessNumber(int n) {
        Scanner sc=new Scanner (System.in);
        int pick=sc.nextInt();
        if(n==pick){
            return 0;
        }else if(n>pick){
            return -1;
        }else{
            return 1;
        }
    }

    static boolean sorted(int [] nums,int i){
        if(i==nums.length-1) return true;
       if(!(nums[i]<nums[i+1]&&sorted(nums,i+1))){
           return false;
       }
       return true;
    }
    static int answ(int n){
        if(n<10){
            System.out.print(n);
            return n;
        }
        System.out.print(n%10);
        return answ(n/10);
    }
    /*static String remove(String sen2){
        StringBuilder str= new StringBuilder("");
        int length=sen2.length();
        for (int i = 0; i < length; i++)
        {   char charAtPosition = sen2.charAt(i);
            if (str.toString().indexOf(charAtPosition) < 0)  str.append(charAtPosition);
        }
       // return str.toString();
        return 1
    }

     */
    static int outp(int[] nums){

                int n = nums.length;
                int max = Integer.MIN_VALUE, sum = 0;

                for(int i=0;i<n;i++){
                    sum += nums[i];
                    max = Math.max(sum,max);

                    if(sum<0) sum = 0;
                }

                return max;

    }

}


