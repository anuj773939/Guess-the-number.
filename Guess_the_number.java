package com.company;
import java.util.Scanner;
import java.util.Random;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        if (inputNumber == number) {
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
            System.out.println("Guess higher number");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
            System.out.println("Guess lower number");
        }
        return false;
    }
}
    public class Guess_the_number {
        public static void main(String[] args) {
            /* Create a class Game which allows the user to play "Guess the number" game once.
             */
            Game g = new Game();
            boolean b = false;
            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumber();
                System.out.println(b);
            }
        }
    }
