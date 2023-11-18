package homework_nr_17.Account;

public class Withdraw implements BankTransaction{
    private final double amount;
    Account account;

    public Withdraw(double amount, Account account) {
        this.amount = amount;
        this.account = account;
    }

    @Override
    public void run () {
        account.withdraw(amount);
    }
}
