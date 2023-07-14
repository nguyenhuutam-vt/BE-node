package ATMSystem;

public class Transaction {
    public static void main(String[] args) {
        Account account = new Account(1000.0);
        ATM atm = new ATM(account);
        System.out.println("Current balance: " + atm.checkBalance());
        atm.deposit(500);
        System.out.println("Send money success");
        System.out.println("Current balance: " + atm.checkBalance());
        atm.withdraw(500);
        System.out.println("Current balance: " + atm.checkBalance());
    }
}
