package lesson3.bank;

public class CheckingAccount extends BankAccount {

    @Override
    protected double calculateInterest() {
        return getBalance();
    }

}
