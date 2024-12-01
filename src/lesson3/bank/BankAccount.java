package lesson3.bank;

public abstract class BankAccount {

    private String accountNumber;
    private double balance;

    protected abstract double calculateInterest();

    protected double deposit(double amount) {
        return balance + amount;
    }

    protected double widthraw(double amount) throws Exception {
        if (balance <= amount) {
            throw new Exception("Not enough money, bitch");
        }
        return this.balance - amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
