package ictgradschool.industry.controlflow.guessing;

import ictgradschool.Keyboard;

/**
 * A guessing game!
 */
public class GuessingGame {

    public void start() {
        int goal = (int) (Math.random() * 100 + 1);

        int guess = 0;
        while (guess != goal) {


            System.out.println("Enter your guess:" + guess);
            guess = Integer.parseInt(Keyboard.readInput());

            if (guess > goal)
            {
                System.out.println("Too high, try again");
            }

          else if (guess < goal)
            {
                System.out.println("Too low, try again");
            }

          else{
                System.out.println("Perfect!!");
            }

        }
        System.out.println("Goodbye"); // TODO Write your code here.
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        GuessingGame ex = new GuessingGame();
        ex.start();

    }
}
