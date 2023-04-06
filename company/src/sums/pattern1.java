package sums;

import java.sql.SQLOutput;
import java.util.*;

public class pattern1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("input value of n");
    int n = sc.nextInt();

 for(int i = 0;i<n;i++) {
     for (int j = 0; j < i; j++) {
        if(i==0||i==n-1){
            System.out.println();
        }
     }
     System.out.println();
 }
}
}
