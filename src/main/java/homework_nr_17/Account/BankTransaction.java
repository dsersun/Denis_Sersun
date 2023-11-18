package homework_nr_17.Account;

@FunctionalInterface
public interface BankTransaction extends Runnable {
    void run();
}
