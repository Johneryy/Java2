package assignments;

import java.util.Random;
import java.util.Scanner;

public class  GuessRandomNumber {
    public static void main(String[] args) {

        {
            int answer, guess;

            final int MAX = 100;

            Scanner input = new Scanner(System.in);

            Random rand = new Random();

            boolean correct = false;

            answer =rand.nextInt(MAX) + 1;

            while(!correct) {
                System.out.println("Guess a number between 1 and 100: "
                );

                guess = input.nextInt();

                if(guess > answer) {
                    System.out.println("Too high, try again");
                }

                else {
                    System.out.println("Yes,you guess the number correctly:" );
                    correct = true;
                }
            }
            System.exit(0);


        }
    }
}
