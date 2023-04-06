package com.assingment;

public class MagicNo {
    public static void main(String[] args) {
        int n=3;
        int s=64;
        boolean ans=(s&(s-1))==0;
        System.out.println((Integer.toBinaryString(s)));
        System.out.println((Integer.toBinaryString(s-1)));
        System.out.println(ans);
        System.out.println(Magic(n));
    }
    public static int Magic(int n){
        int i=5;
        int Sum = 0;
       while(n>0){
            Sum+=i*(n&1);
            n=n>>1;
            i=i*5;
        }
       return Sum;
    }
}
