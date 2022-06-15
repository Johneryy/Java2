package MyProjects;
import java.util.Scanner;

public class Grade {
    public static void main(String... args) {
         System.out.print("Enter Student Score:");

         Scanner input = new Scanner(System.in);
         int studentGrade = input.nextInt();

        if (studentGrade >= 90) {
            System.out.println("A");
        }
        else if (studentGrade >= 80) {
            System.out.println("B");
        }
        else if (studentGrade >= 70) {
            System.out.println("C");
        }
        else if (studentGrade >= 60) {
            System.out.println("D");
        }
        else if (studentGrade < 60) {
            System.out.println("F");
        }

    }
}
