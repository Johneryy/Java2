import java.util.Scanner;

//If a user enters 55 and above,print pass.If the user enters below 55,print fail.

public class Buba {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);

        System.out.println("Enter your score");

        int userScore = score.nextInt();
        System.out.println();
        if(userScore >=55) {
            System.out.println("Pass");
        }
        if(userScore < 55); {
            System.out.println("Fail");
        }
    }
}
