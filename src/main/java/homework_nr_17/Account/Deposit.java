package homework_nr_17.Account;

public class Deposit implements BankTransaction{
    private double amount;
    Account account;

    public Deposit(double amount, Account account) {
        this.amount = amount;
        this.account = account;
    }

    @Override
    public void run () {
        account.deposit(amount);
    }
}
