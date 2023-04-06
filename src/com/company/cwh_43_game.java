package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;int i=0;int n;
    Game(){
        Random rd = new Random();
        computer = rd.nextInt(100);
       //System.out.println(computer);
    }
   void takeUserInput() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Guess a no. between 1 to 100: ");
       n = sc.nextInt();

   }
   void isCorrectNumber(){

       if(computer==n){
           System.out.println("Congratulations, You Guessed The Correct Number!");
       }else if(n>computer){
           System.out.println("guessed no. is greater than actual no.\n Try Again! ");
       }else {
           System.out.println("guessed no. is smaller than actual no.\n Try Again!");
       }

   } void setNoOfGuess(int guess){
        i = guess;}
   int getNoOfGuess(){
        return i;
   }
}
public class cwh_43_game {
    public static void main(String[] args) {
        Game rc=new Game();
        do {
            rc.takeUserInput();
            if (rc.n<0||rc.n>100){
                System.out.println("\tNUMBER OUT OF RANGE !\n\tTry Again.\n");
                continue;
            }
            rc.setNoOfGuess(++rc.i);
            rc.isCorrectNumber();
        }while(rc.n!=rc.computer);
        System.out.println("\tNumber of Attempts You Have Taken To Guess Correct  = "+rc.getNoOfGuess());
    }
}

