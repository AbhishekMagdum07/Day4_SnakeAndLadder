package com.snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Programme");
        System.out.println("Game will start from position 0 ");
        int position = 0 ;
        int dieCount = 0 ;

        //Uc2 - The Player rolls the die to get a number between 1 to 6.
        while (position < 100) {
            Random random = new Random();
            int dice = random.nextInt(6) + 1;
            System.out.println("Dice Number is = " + dice);
            dieCount++;
            System.out.println("Position of Die ="+dieCount);

            //Uc3 - The Player then checks for Option. They are No Play,Ladder or Snake.

            int move = random.nextInt(3);

            switch (move) {
                case 0:
                    System.out.println("Ladder");
                    position += dice;
                    break;
                case 1:
                    System.out.println("Snake");
                    position -= dice;
                    if (position < 0) {
                        position = 0;
                    }
                    break;

                default:
                    System.out.println("No Play");
            }
            if(position > 100){
                position -= dice;
            }
        }

        System.out.println("Player Position is = "+position);
        System.out.println("Numbers of Times Dice was Played = "+dieCount);
    }
}