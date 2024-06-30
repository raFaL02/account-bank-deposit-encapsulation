package entities;

public class Account {

    private final int accountNumber;
    private String holder;
    private double balance;

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(int accountNumber, String holder, double initilDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initilDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    public String toString() {
        return "Account: " + accountNumber + ", " + "Holder: " + holder + ", " + "Balance: $" + String.format("%.2f", balance);
    }
}
