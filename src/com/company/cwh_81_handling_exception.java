package com.company;

import java.util.Scanner;

public class cwh_81_handling_exception {
    public static void main(String[] args) {
        int [] marks=new int[5];
        marks[0]=67;
        marks[1]=56;
        marks[2]=40;
        marks[3]=78;
        marks[4]=32;
        Scanner er =new Scanner(System.in);
        System.out.println("Enter the index of array: ");
        int ind=er.nextInt();

        System.out.println("Enter the number you want to divide with:");
        int n=er.nextInt();
        try {
            System.out.println("The value of array index entered is "+ marks[ind]);
            System.out.println("The value of array/number is "+ marks[ind]/n);
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException c){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(c);
        }catch(Exception w){
            System.out.println("Other Exception occurred!");
            System.out.println(w);
        }
    }
}

