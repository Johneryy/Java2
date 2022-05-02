package assignments;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class CostOfDriving {
    public CostOfDriving() {
    }

    public static void main(String... var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double var2 = var1.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double var4 = var1.nextDouble();
        System.out.print("Enter price per gallon: ");
        double var6 = var1.nextDouble();
        double var8 = var2 * var6 / var4;
        System.out.printf("The cost of Driving is $%.2f", var8);
    }
}

