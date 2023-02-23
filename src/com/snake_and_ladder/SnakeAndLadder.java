package com.snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1Position = 0;
        int player2Position = 0;

        Random random = new Random();

        while (player1Position < 100) {

            int dice = random.nextInt(6) + 1;
            int dice1 = random.nextInt(6) + 1;
            int step = random.nextInt(3);


            switch (step) {
                case 0:
                    System.out.println("No play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    player1Position = player1Position + dice;
                    player2Position = player2Position + dice1;
                    if (step == 1) {
                        player1Position = player1Position + dice;
                        player2Position = player2Position + dice;
                    }
                    if (player1Position > 100) {
                        player1Position = 100;
                    }
                    if (player2Position > 100) {
                        player2Position = 100;
                    }

                    break;
                default:
                    System.out.println("snake");
                    player1Position = player1Position - dice;
                    player2Position = player2Position - dice1;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                    if (player2Position < 0) {
                        player2Position = 0;

                    }
                    break;
            }


            System.out.println("Player 1 position = " + player1Position);
            System.out.println("player 2 position = " + player2Position);

            if(player1Position > player2Position) {
                System.out.println("Player 1 is Winner");
            }else if (player2Position > player1Position) {
                System.out.println("Player 2 is Winner");
            }else{
                System.out.println("Both player score are equal");
            }
        }
    }
}




