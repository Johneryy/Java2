package assignments;

import java.util.Scanner;

public class PrimeNumberInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer");

        int num = input.nextInt();

        if (num < 1)

            System.out.print("Enter a number greater than 1" + "Perform the program again");

        else if (num == 2)
            System.out.print("It is a PrimeNumber");

        else if (num % 2 == 0)
            System.out.print("It is not a PrimeNumber");
    }
}
