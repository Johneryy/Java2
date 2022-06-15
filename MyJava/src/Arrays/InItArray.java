package Arrays;

public class InItArray {
    public static void main(String[] args) {

        int[] Array = new int[12];
        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter =0; counter < Array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, Array[counter]);
        }
    }
}
