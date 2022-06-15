package MyProjects;

 import java.util.Scanner;

public class Comparison {

 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter first integer");
  int Number1 = input.nextInt();

  System.out.print("Enter second integer");
  int Number2 = input.nextInt();

  int sum =  Number1 +  Number2;

  System.out.printf("Sum is %d%n",sum);

  if(Number1 == Number2) {
   System.out.printf("%d == %d%n", Number1,Number2);
  }
  if(Number1 != Number2) {
   System.out.printf("%d != %d%n" , Number1, Number2);
  }
  if(Number1 > Number2) {
   System.out.printf("%d > %d%n", Number1,Number2);
  }
  if(Number1 < Number2) {
   System.out.printf("%d < %d%n", Number1,Number2);
  }
  if(Number1 >= Number2) {
   System.out.printf("%d >= %d%n", Number1,Number2);
  }
  if(Number1 <= Number2) {
   System.out.printf("%d <= %d%n", Number1,Number2);
  }

   }
}
