package tdd;

import java.util.Scanner;

public class MysteryNumber {

    public static int mysteryNumber = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Guess the mystery number:");
        int guess = input.nextInt();

        System.out.print("if correctly guessed:");
        if (guess == mysteryNumber) {
            System.out.println("Correct!");
        }

        if (guess < mysteryNumber) {
            System.out.println("Too low!");
        }

        if (guess < mysteryNumber) {
            System.out.println("Too high!");
        }
    }
}


