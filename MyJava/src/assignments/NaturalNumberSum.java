package assignments;

public class NaturalNumberSum {
    public static void main(String[] args) {


        int number = 1;
        int sum = 0;
        while (number <= 10) {
            System.out.println(number);
            sum = sum + number;
            number = number + 1;
        }
        System.out.println("Sum = " + sum);

    }

}
