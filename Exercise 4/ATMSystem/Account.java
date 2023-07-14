package ATMSystem;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Wirthdraw success");
        } else {
            System.out.println("Don't enough money");
        }
    }
}
