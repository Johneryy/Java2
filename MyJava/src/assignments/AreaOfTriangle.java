package assignments;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class AreaOfTriangle {
    public AreaOfTriangle() {
    }

    public static void main(String... var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double var2 = var1.nextDouble();
        double var4 = var1.nextDouble();
        double var6 = var1.nextDouble();
        double var8 = var1.nextDouble();
        double var10 = var1.nextDouble();
        double var12 = var1.nextDouble();
        double var14 = (var2 * (var8 - var12) + var6 * (var12 - var4) + var10 * (var4 - var8)) / 2.0;
        double var16 = Math.abs(var14);
        System.out.printf("The area of the triangle is %.1f", var16);
    }
}
