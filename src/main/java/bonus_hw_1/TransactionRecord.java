package bonus_hw_1;

import java.util.concurrent.atomic.AtomicInteger;

class TransactionRecord {
    private static final AtomicInteger counter = new AtomicInteger(1);
    private int transactionNumber;
    private String accountNumber;
    private String type;
    private double amount;

    public TransactionRecord(String accountNumber, String type, double amount) {
        this.transactionNumber = counter.getAndIncrement();
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
