package com.company;

import java.util.*;
public class v_20_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("choose no. between 1 to 3");
        System.out.println("1:-rock,2:-scissor,3:-paper");
        int user = sc.nextInt();
        if(user>3){
            System.out.println("invalid no. you cant play game");
        }

        int computer;
        computer = rd.nextInt(4);
       // System.out.println("computer choose:" + computer);
        if(computer==1){
            System.out.println("Computer choose: Rock");
        }
        else if(computer ==2){
            System.out.println("Computer choose:Scissors ");
        }
        else if(computer ==3){
            System.out.println("Computer choose: Paper ");
        }
           if (user == computer) {
                System.out.println("its a draw");
            } else if ((user == 1 && computer == 2) || (user == 2 && computer == 3) || (user == 3 && computer == 1)) {
                System.out.println(" You win");
            } else {
                System.out.println("Computer win");
            }
            System.out.println("THANK YOU for playing!");

        }
    }

