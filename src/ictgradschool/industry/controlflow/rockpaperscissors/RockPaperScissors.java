package ictgradschool.industry.controlflow.rockpaperscissors;

import ictgradschool.Keyboard;

import java.awt.print.Printable;

/**
 A game of Rock, Paper Scissors
 */
public class RockPaperScissors {

    public static final int ROCK = 1;
    public static final int Paper = 2;
    public static final int Scissors = 3;
    public static final int Quit = 4;
    // TODO Make similar constants for PAPER and SCISSORS, to improve readability of your code.

    public void start() {

        System.out.println("Hi, What is your name?");
        String playername= Keyboard.readInput();
        // TODO Write your code here which calls your other methods in order to play the game. Implement this
        // as detailed in the exercise sheet.
    }


    public void displayPlayerChoice(String name, int choice) {



        // TODO This method should print out a message stating that someone chose a particular thing (rock, paper or scissors)
    }

    public boolean userWins(int playerChoice, int computerChoice) {

        // TODO Determine who wins and return true if the player won, false otherwise.
        return false;
    }

    public String getResultString(int playerChoice, int computerChoice) {

        final String PAPER_WINS = "paper covers rock";
        final String ROCK_WINS = "rock smashes scissors";
        final String SCISSORS_WINS = "scissors cut paper";
        final String TIE = " you chose the same as the computer";

        // TODO Return one of the above messages depending on what playerChoice and computerChoice are.
        return null;
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        RockPaperScissors ex = new RockPaperScissors();
        ex.start();

    }
}
