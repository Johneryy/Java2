package assignments;

import java.util.Scanner;


public class ValueOfRaisedPower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        int number1 = input.nextInt();

        System.out.println("Enter the power for that number");

        int number2 = input.nextInt();

        int power = 1;

        if (number2 >= 1) {
             for (int i = 1; i <= number2; i++) {
                 power = power * number1;
             }

             System.out.println(power);
        }
    }
}
