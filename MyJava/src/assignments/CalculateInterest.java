package assignments;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class CalculateInterest {
    public CalculateInterest() {
    }

    public static void main(String... var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter Balance and interest rate: ");
        int var2 = var1.nextInt();
        double var3 = var1.nextDouble();
        double var5 = (double)var2 * (var3 / 1200.0);
        System.out.printf("The Interest is %f", var5);
    }
}

