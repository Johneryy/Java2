package ZenithBank;


import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MyZenithBankApp {
    static Bank johneryBank = new Bank();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("WELCOME TO ZENITHBANK");
        int sentinel = 0;

        try {
            main(sentinel);
        } catch (InputMismatchException | IllegalArgumentException | NullPointerException e) {
            System.out.println("error: " + e);
        } finally {
            System.out.println("Thanks for Banking with us!");
        }

    }

    private static void main(int sentinel) {
        while (sentinel != -1) {
            System.out.println("""
                    1 -> SignUp
                    2 -> SignIn to existing Account
                    3 -> View all Customers
                    4 -> Delete profile
                    0 -> Exit
                    """);
            int choice = scanner.nextInt();
            switch (choice) {
                default -> System.out.println("Invalid Selection,Try again");
                case 1 -> createAccount();
                case 2 -> {
                    System.out.println("Enter EmailAddress");
                    String email = scanner.next();
                    System.out.println("Enter Pin");
                    String pin = scanner.next();
                    logIn(email, pin);
                }
                case 3 -> {
                    List<Customer> customers = johneryBank.allCustomers();
                    if (customers.size() == 0) {
                        System.out.println("No customer registered yet");
                    } else {
                        for (Customer customer : customers) {
                            System.out.println(customer);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("""
                            Are you sure
                            1. Yes
                            2. No, I changed my mind
                            """);
                    int input = scanner.nextInt();
                    switch (input) {
                        case 1 -> {
                            System.out.println("Alright..Enter your email");
                            String email = scanner.next();
                            System.out.println(johneryBank.removeCustomer(email));
                        }
                        case 2 -> System.out.println("Smiles");
                    }
                }
                case 0 -> {
                    System.out.println("Please, rate our app on a scale of 1 -5 stars");
                    int rate = scanner.nextInt();
                    int i = 1;
                    while (i <= rate) {
                        try {
                            System.out.print("*");
                            Thread.sleep(400);
                        } catch (Exception ignored) {
                        }
                        i++;
                    }
                    System.out.println();

                    sentinel = -1;
                }
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(700);
        } catch (Exception ignored) {
        }
    }

    public static void createAccount() {
        System.out.println("Enter your First Name: ");
        String firstName = scanner.next();

        System.out.println("Enter your Last Name: ");
        String lastname = scanner.next();

        System.out.println("Enter your Email Address");
        String email = scanner.next();

        System.out.println("Enter your PhoneNumber");
        String phoneNumber = scanner.next();

        System.out.println("Enter your date of birth (format: DD MM YY) \"separated by space\":");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        Gender gender = null;

        System.out.printf("""
                Select your gender
                1. %s
                2. %s
                3. %s
                """, Gender.MALE, Gender.FEMALE,Gender.NONBINARY);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> gender = Gender.MALE;
            case 2 -> gender = Gender.FEMALE;
            case 3 -> gender = Gender.NONBINARY;
        }

        Customer customer = new Customer(firstName, lastname,
                email, phoneNumber,
                day, month, year,
                gender);

        System.out.println("Enter pin to activate Account: ");
        String pin = scanner.next();

        Account account = new Account(firstName, email, pin);
        customer.createAccount(account);

        johneryBank.addCustomer(customer);
        System.out.print("Creating account");
        for (int i = 0; i <8 ; i++) {
            System.out.print(".");
            sleep();
        }
        System.out.println();
        System.out.println("Savings account created successfully");
        System.out.print("Logging in");
        for (int i = 0; i <8 ; i++) {
            System.out.print(".");
            sleep();
        }
        System.out.println();

        logIn(email, pin);
    }

    public static void logIn(String email, String pi) {
        Customer customer = johneryBank.getACustomer(email);
        Account account = customer.getAnAccount(email);
        List<Account> accounts = customer.getAccounts();
        if (accounts.size() > 1) {
            System.out.println("You have " + accounts.size() + " accounts");
            System.out.println("Choose account you want to Login to:");
            int currentAcNum = 0;
            Account currentAC = customer.getAnAccount(email);
            for (Account acct : accounts) {
                if (acct.getAccountType().equals(String.valueOf(Account.accountTypes.CURRENT))) {
                    currentAcNum = acct.getAccountNumber();
                    currentAC = acct;
                    break;
                }
            }
            System.out.printf("""
                    1 -> Savings Account: %d
                    2 -> Current Account: %d
                    %n""", account.getAccountNumber(), currentAcNum);
            int type = scanner.nextInt();
            if (type == 2) {
                account = currentAC;
            }
        }

        System.out.println(customer.validatePin(email, pi));
        Scanner scanner = new Scanner(System.in);

        int sentinel = 0;
        while (sentinel != -1) {
            System.out.printf("You are currently logged into your %s account..\n" +
                            "account no: %d%n",
                    account.getAccountType(), account.getAccountNumber());
            System.out.printf("""
                    Hi, %s!
                    Balance: %s
                    1 -> Add Money+
                    2 -> Withdraw-
                    3 -> Transfer-
                    4 -> TransactionHistory
                    5 -> View All Accounts %n""", customer.getFirstName(), account.getBalance(pi));
            if (accounts.size() < 2) {
                System.out.println("6 -> Create Current account");
            }
            System.out.println("0 -> Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter amount:");
                    int amount = scanner.nextInt();
                    account.deposit(amount);
                }
                case 2 -> {
                    System.out.println("Enter amount:");
                    int amount = scanner.nextInt();

                    System.out.println("Enter pin:");
                    String pin = scanner.next();
                    account.withdraw(pin, amount);
                }
                case 3 -> {
                    System.out.println("Enter account number");
                    int accountNumber = scanner.nextInt();
                    System.out.println("Enter amount:");
                    int amount = scanner.nextInt();
                    System.out.println("Enter pin:");
                    String pin = scanner.next();
                    String status = johneryBank.transfer(account, accountNumber, amount, pin);
                    System.out.println(status);
                }

                case 4 -> {
                    List<TransactionHistory> list = account.getTransactionHistoryList();
                    for (TransactionHistory history : list) {
                        System.out.println(history);
                    }
                }
                case 5 -> {
                    List<Account> a = customer.getAccounts();
                    for (Account acts : a) {
                        System.out.println(acts);
                    }
                }
                case 6 -> {
                    System.out.println("Enter initial deposit, minimum of 100_000 at once");
                    int initialDeposit = scanner.nextInt();
                    System.out.println("Enter pin");
                    String pin = scanner.next();
                    CurrentAccount currentAccount = new CurrentAccount(customer.getName(),
                            customer.getEmail(), pin, initialDeposit);
                    customer.createAccount(currentAccount);
                    System.out.println("Current account created successfully");
                }
                case 0 -> sentinel = -1;
            }
        }
    }
}
