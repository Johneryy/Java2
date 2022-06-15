package OOP;

public class Main {
    public static void main(String[] args) {
        Native John = new Native();
        John.eat();
        John.sleep();
        System.out.println(John.learnJava());

        Facilitator Grace = new Facilitator();
        String result = Grace.teachJava();
        System.out.println(result);
    }
}
