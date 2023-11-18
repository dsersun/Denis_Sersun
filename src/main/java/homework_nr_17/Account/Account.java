package homework_nr_17.Account;

import homework_nr_17.Client;
import lombok.Data;
import lombok.Getter;

@Data
public class Account {
    private Client client;
    private CurrencyList currency;
    private AccountType accountType;
    @Getter
    private double balance;
    private String AccountNumber;

    public double getBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public Account (Client client, CurrencyList currency, AccountType accountType) {
        this.client = client;
        this.currency = currency;
        this.accountType = accountType;
        this.balance = 0;
        this.AccountNumber = new IBAN ("MD","AG")
                .GenerateIban (currency.getCurrencyCode (),accountType.getAccountCode ());
        client.AssociatedAccounts.add (getAccountNumber ());
    }

    public synchronized void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            notifyAll();
        }
    }

    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            try {
                System.out.println ("Insufficient funds for withdrawal. Waiting...");
                wait ();
            } catch (InterruptedException e) {
                System.err.println (e.getMessage ());
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }


    public synchronized void transfer(Account toAccount, double amount) {
        while (balance < amount) {
            try {
                System.out.println("Insufficient funds for transfer. Waiting...");
                wait();
            } catch (InterruptedException e) {
                System.err.println (e.getMessage ());
            }
        }
        balance -= amount;
        toAccount.deposit(amount);
        System.out.println("Transferred: " + amount);
    }
}
