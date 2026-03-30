import java.util.Scanner;

class BankAccount {
    double balance;

    // Constructor
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Balance inquiry
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initial = sc.nextDouble();

        BankAccount account = new BankAccount(initial);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.showBalance();

        sc.close();
    }
}