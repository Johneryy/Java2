package MyProjects;

import java.util.Scanner;

public class VoiceResponse {
    public static void main(String...  args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Press one for English\nPress Two for Ibo\nPress three for French\nPress four for Yoruba");
        System.out.println("Enter voice between 1 to 4");

        int voice = input.nextInt();

        if (voice == 1) {
            System.out.println("1 for Data\n2 for Transfer");
            System.out.print("Enter the number: ");
            int English = input.nextInt();
            if (English == 1) {
                System.out.print("Data");
            } else {
                System.out.print("Transfer");
            }
        }
        if (voice == 2) {
            System.out.println("1 for Sharing\n2 for Caring");
            int french = input.nextInt();
            if (french == 1) {
                    System.out.print("Sharing");
                } else {
                System.out.print("caring");
            }
        }
        if (voice == 3) {
            System.out.println("1 for Egg\n2 for champagne");
            int ibo = input.nextInt();
            if (ibo == 1) {
                System.out.print("egg");
            } else {
                    System.out.print("champagne");
                }
            }
        if (voice == 4) {
            System.out.println("1 for Ewa\n2 for Agoyin");
            int Yoruba = input.nextInt();
            if (Yoruba == 1) {
                System.out.print("ewa");
            } else {
                    System.out.print("agoyin");
                }
            }
        }
    }


