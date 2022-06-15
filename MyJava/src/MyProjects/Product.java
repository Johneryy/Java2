package MyProjects;

import java.util.Scanner;


public class Product {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer");
        int Number1 = input.nextInt();

        System.out.print("Enter second integer");
        int Number2 = input.nextInt();

        System.out.print("Enter third integer");
        int Number3 = input.nextInt();

        int result = Number1 * Number2 * Number3;

         System.out.printf("Product is %d%n", result);
    }
}
