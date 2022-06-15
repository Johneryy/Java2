package tdd;

import java.util.Scanner;

//write a small app like zuba that asks a user to enter a score like 55 and above.print pass,if user enters lower than 55, print fail.
//do not use if...else statements.Only use if statements.

public class Buba {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);

        System.out.println("Enter your score");
        int userScore = score.nextInt();

        if(userScore >=55) {
            System.out.println("Pass");
        }
        if(userScore < 55) {
            System.out.println("Fail");

        }
    }
}
