package bonus_hw_1;

public class WithdrawalTransaction implements Transaction{
    private final BankAccount account;
    private final double amount;

    public WithdrawalTransaction(BankAccount account, double amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.withdraw(amount);
    }
}
