package MyProjects;

import java.util.Scanner;

public class Grade2 {
    public static void main(String... args) {

        System.out.print("Enter score:");

        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if (grade >= 60) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
            System.out.println("You must take this course again.");
        }
    }
}
