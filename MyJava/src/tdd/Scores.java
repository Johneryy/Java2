package tdd;
import java.util.Scanner;

//Pseudocode for Grade system

//Start.

//Ask user to input a score
//if a student score is above 90 and above, output 'A'.
//if a student score is above 80 and less than 90,output 'B'.
//if a student score is above 70 and less than 80,output 'C'.
//if a student score is above 60 and less than 70,output 'D'.
//if a student score is less than 60,output 'F'.

//Finish.

public class Scores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score");

        int studentScore = input.nextInt();

        if (studentScore >= 90 && studentScore <= 100) {
            System.out.print("A");
        }
        if(studentScore >= 80 && studentScore <90){
            System.out.print("B");
        }

        if(studentScore >= 70 && studentScore <80){
            System.out.print("C");
;       }
        if (studentScore >= 60 && studentScore <70) {
            System.out.print("D");
        }
        if(studentScore < 60) {
            System.out.print("F");
        }

    }

    public String getScores(int studentScore) {
        String grade = null;
        if (studentScore >= 90 && studentScore <= 100) grade = "A";
        if (studentScore >= 80 && studentScore <= 90) grade = "B";
        if (studentScore >= 70 && studentScore <= 80) grade = "C";
        if (studentScore >= 60 && studentScore <= 70) grade = "D";
        if (studentScore <=60) grade = "F";

        return grade;
    }
}

