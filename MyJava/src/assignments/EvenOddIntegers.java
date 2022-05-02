package assignments;

import java.util.Scanner;

public class EvenOddIntegers {

    public static void main(String[] args) {

        int InputNumbers = 0, OddNumbers = 0, EvenNumbers = 0, LoopingVar = 0, PrintAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers you want to input: ");
        PrintAmount = input.nextInt();

        while (LoopingVar <= PrintAmount) {
            LoopingVar++;

            System.out.print("Please input a number: ");
            InputNumbers = input.nextInt();

            if (InputNumbers % 2 == 0) {
                OddNumbers = EvenNumbers = InputNumbers;
            }
            if (LoopingVar == PrintAmount) {
                break;
            }
        }
        if (LoopingVar == PrintAmount) {
            System.out.println("Sum of even numbers is : " + OddNumbers);
            System.out.println("Sum of odd numbers is :" + EvenNumbers);
            System.exit(0);
        }
        if(InputNumbers < 0)
        {
            System.out.print("Invalid input");
            System.exit(0);
        }

    }
}

