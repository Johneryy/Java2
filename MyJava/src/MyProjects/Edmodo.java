package MyProjects;

import java.util.Random;
import java.util.Scanner;

public class Edmodo {
    public static void main (String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many questions will you like to answer?");
        int NoOfQuestions = input.nextInt();
        int counter = 1;
        int correct = 0;
        int wrong = 0;

        while (counter <= NoOfQuestions) {
            char operator = '?';
            int value = 0;
            int a = (int)(1 + (Math.random() * 10));
            int b = (int)(1 + (Math.random() * 10));

            int operatorCount = (int)(1 + (Math.random() * 4));

            switch (operatorCount) {
                case 1: { operator = '+'; value = a + b; }
                break;
                case 2: { operator = '-'; value = a - b; }
                break;
                case 3: { operator = '*'; value = a * b; }
                break;
                case 4: { operator = '/'; value = a / b; }
            }
           System.out.println("Question " + counter +":\n"+ a +" "+ operator + " "+ b + " =");
            int answer = input.nextInt();

            if(answer ==value) {
                ++correct;
            }
            else ++wrong;
            ++counter;
        }

        int score = correct - wrong;

        System.out.printf("Your final score is %d. \nYou got %d correct and %d wrong.", score, correct, wrong);
    }
}
