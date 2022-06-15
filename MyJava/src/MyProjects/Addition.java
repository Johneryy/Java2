package MyProjects;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer");
        int Number1 = input.nextInt();

        System.out.print("Enter second integer");
        int Number2 = input.nextInt();
        
        int result = Number1 + Number2;

        System.out.printf("Sum is %d%n", result);
    }
}


