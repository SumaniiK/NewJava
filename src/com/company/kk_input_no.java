package com.company;
import java.util.*;
public class kk_input_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number ");
     /*   int x=sc.nextInt();
        int product=1;
        int sum=0;
       while(x>=0){
           product *= x%10;
           sum += x%10;
           x=x/10;
       }
        System.out.println("The Answer is "+(product-sum));*/

        int i=0;
        int sum=0;
        while(i!='x'){
             i=sc.nextInt();
             sum +=i;
        }
        System.out.println(sum);
    }
}
