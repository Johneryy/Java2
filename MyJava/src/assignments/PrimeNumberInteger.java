package assignments;

import java.util.Scanner;

public class PrimeNumberInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer:");

        int num = input.nextInt();

        int number = 0;
        int factors = 0;

        for(int i = 1; i<=number; i  ++) {
            if(number%i == 0) {
                factors = factors+1;
            }
        }

        if (factors==2) {
            System.out.println(number+ "is a prime number ");
        }else{
            System.out.println(number+ "is not a prime number");
        }
    }
}
