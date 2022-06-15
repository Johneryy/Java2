package MyProjects;

import java.util.Scanner;

public class VoiceResponse2 {
    public static void main (String... args) {

        System.out.println("Press one for English\nPress Two for Ibo\nPress three for French\nPress four for Yoruba");

        Scanner input = new Scanner(System.in);
        int voice = input.nextInt();

        switch (voice) {
            case 1:
                System.out.println("Press 1 for Data");
                 System.out.println("Press 2 for Transfer");
                 voice = input.nextInt();
                 switch (voice) {
                case 1:
                    System.out.println("Data");
                    break;
                case 2:
                    System.out.println("Transfer");
                    break;
                 }
                 break;

            case 2:
                System.out.println("Press 1 for sharing");
                System.out.println("Press 2 for caring");
                voice = input.nextInt();
                switch (voice) {
                    case 1:
                        System.out.println("Sharing");
                        break;
                    case 2:
                        System.out.println("Caring");
                        break;
                }
                break;

            case 3:
                System.out.println("Press 1 for egg");
                System.out.println("Press 2 for champagne");
                voice = input.nextInt();
                switch (voice) {
                    case 1:
                        System.out.println("Egg");
                        break;
                    case 2:
                        System.out.println("Champagne");
                        break;
                }
                break;

            case 4:
                System.out.println("Press 1 for ewa");
                System.out.println("Press 2 for agoyin");
                voice = input.nextInt();
                switch (voice) {
                    case 1:
                        System.out.println("ewa");
                        break;
                    case 2:
                        System.out.println("Agoyin");
                        break;
                }
        }

    }
}
