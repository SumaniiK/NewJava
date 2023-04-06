package com.company;

import java.util.Scanner;

public class kk_HCF_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two No. :");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int z=1;
        if(m>n){
            for(int i=1;i<=n;i++){
                if(m%i==0&&n%i==0){
                   z =i;
                }
            }
            System.out.println("The HCF of THe No "+m+" and "+n+" is: "+ z);
        }else{
            for(int i=1;i<=m;i++){
                if(m%i==0&&n%i==0){
                    z =i;
                }
            }System.out.println("The HCF of "+ m+ " and " + n +" is : " + z);
        }
        int k=m/z; int l=n/z;
     //int l=n/z;
        System.out.println("The lCM of the No. "+m+ " and "+n+ " is: "+ (z *k*l));
    }
}
