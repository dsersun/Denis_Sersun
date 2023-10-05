package bonus_hw_1;

class DepositTransaction implements Transaction {
    private final BankAccount account;
    private final double amount;

    public DepositTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.supplyAccount(amount);
    }
}
