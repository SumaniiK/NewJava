package com.assingment;

import java.util.*;
//Richest costumer
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of integer Grid");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] wealth = new int[m][n];
        System.out.println("Enter the wealth of persons of their different bank accounts");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wealth[i][j] = sc.nextInt();
            }
        }
        System.out.print(wealth[m-1][n]+" ");
       // System.out.println("Accounts " + Arrays.toString(wealth));
    }
    }

