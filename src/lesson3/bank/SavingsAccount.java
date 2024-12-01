package lesson3.bank;

public class SavingsAccount extends BankAccount {

    @Override
    protected double calculateInterest() {
        setBalance(getBalance() + getBalance() * 0.05);
        return getBalance();
    }
}
