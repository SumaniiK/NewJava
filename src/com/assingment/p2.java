package com.assingment;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("Enter the index of array");
        int m=sc.nextInt();
        int []num=new int[m];
        for(int i=0;i<m;i++) {
            num[i] = rd.nextInt(m - 1);
        }System.out.println("The element of array 'num' is: "+ Arrays.toString(num));
        int []ans=new int[m];
        for(int i=0;i<m;i++){
            ans[i] = num[num[i]];
        }System.out.println("The element of array 'ans' is: "+ Arrays.toString(ans));
    }
}
