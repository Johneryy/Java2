 package assignments;
import java.util.Scanner;


public class CalculatingTheSumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter four digits: ");
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        int digit3 = input.nextInt();
        int digit4 = input.nextInt();
        System.out.println("The sum of the four digits = " + digitSum(digit1,digit2,digit3,digit4));

    }

    private static int digitSum(int digit1, int digit2, int digit3, int digit4) {
        int sum = digit1 + digit2 + digit3 + digit4;

        return sum;
    }
}
