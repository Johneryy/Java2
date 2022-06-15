package MyProjects;

import java.util.Scanner;

public class Grade3 {
    public static void main(String... args) {

        System.out.print("Enter score:");

        Scanner input = new Scanner(System.in);
        int studentGrade = input.nextInt();

        System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
    }
}