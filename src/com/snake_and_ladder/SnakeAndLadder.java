package com.snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Programme");
        System.out.println("Game will start from position 0 ");
        int startPosition = 0 ;

        //Uc2 - The Player rolls the die to get a number between 1 to 6.

        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Dice Number is = "+dice);
    }

}
