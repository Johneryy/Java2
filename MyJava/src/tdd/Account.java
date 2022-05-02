package tdd;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;

    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (balance > 0 && amount > 0) {
            balance = balance - amount;
        }
    }
}