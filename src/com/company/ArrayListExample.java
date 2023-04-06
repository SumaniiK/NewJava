package com.company;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Syntax
        ArrayList<Integer> L1=new ArrayList<>(5);
     /*   L1.add(89);
        L1.add(65);
        L1.add(32);
        L1.add(45);
        L1.add(99);
        L1.add(53);
        System.out.println(L1);
        System.out.println(L1.contains(7545));//to check whether the given element is present or not in arraylist
        L1.set(5,32);//set the following integer in the following index
        System.out.println(L1);
        L1.remove(3);
        System.out.println(L1);

      */
        // input
        for (int i = 0; i < 5; i++) {
           L1.add(sc.nextInt());
        }
        System.out.println(L1);
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(L1.get(i)); // pass index here, list[index] syntax will not work here
        }

    }
}
