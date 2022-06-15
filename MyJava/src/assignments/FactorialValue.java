package assignments;

public class FactorialValue {
    public static void main(String[] args) {
        int x,factorial = 1;
        int number =3;
        for(x = 1; x < number; x++) {

            factorial = factorial * x;
        }
        System.out.println("Factorial of " + number + " is : " + factorial);
    }
}

