package bonus_hw_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    // sett color
    String reset = "\u001B[0m"; // Reset to default color
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    List<BankAccount> accounts = new ArrayList<>();
    List<TransactionRecord> transactionsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    private static BankAccount findAccountByNumber(List<BankAccount> accounts, String accountNumber) {
        for (BankAccount account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        return null;
    }

    public void newAccount() {
        System.out.print("Enter account holder name: ");
        String ownerName = scanner.next();
        BankAccount newAccount = new BankAccount(ownerName);
        accounts.add(newAccount);
        System.out.println(green + "The account has been successfully opened. Account number: " + red +
                newAccount.getAccountNumber() + reset);
    }

    public void listAccounts() {
        System.out.println("List of accounts: ");
        for (BankAccount account : accounts) {
            System.out.println(green + "IBAN: " + reset + account.getAccountNumber() + green +" - Holder name: " + reset +
                    account.getAccountHolderName() + green + " - Balance: " + reset + account.getAccountBalance());
        }
    }

    public void deposit() {
        System.out.println("Supplying account!");
        System.out.print("Enter account number:");
        String supplyAccountNumber = scanner.next();
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        BankAccount depositAccount = findAccountByNumber(accounts, supplyAccountNumber);
        if (depositAccount != null) {
            DepositTransaction supply = new DepositTransaction(depositAccount, depositAmount);
            supply.process();
            transactionsList.add(new TransactionRecord(depositAccount.getAccountNumber(), "Supply  ", depositAmount));
        } else {
            System.out.println(red + "The account with the specified number was not found.." + reset);
        }
    }


    public void withdraw() {
        System.out.print("Enter account number:");
        String account = scanner.next();
        System.out.print("Enter the amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();
        BankAccount withdrawalAccount = findAccountByNumber(accounts, account);
        if (withdrawalAccount != null) {
            WithdrawalTransaction withdraw = new WithdrawalTransaction(withdrawalAccount, withdrawalAmount);
            withdraw.process();
            transactionsList.add(new TransactionRecord(withdrawalAccount.getAccountNumber(), "Withdraw", withdrawalAmount));
        } else {
            System.out.println(red + "The account with the specified number was not found.." + reset);
        }
    }

    public void operationsList() {
        System.out.println("List of operations:");
        for (TransactionRecord element : transactionsList) {
            System.out.println(red + "# " + reset + element.getTransactionNumber() + green + " - Account Number: " + reset +
                    element.getAccountNumber() + green + " - Type: " + reset +  element.getType() +
                    green + " - Amount: " + reset + element.getAmount());
        }
    }

    public void stopApplication() {
        System.out.println("Ending the program.");
        scanner.close();
    }
}
