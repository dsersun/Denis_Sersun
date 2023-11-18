package homework_nr_17;

import homework_nr_17.Account.*;


public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Marina", "Sersun", "1990-05-22");

        Account a1 = new Account(c1, CurrencyList.MDL, AccountType.CARD);
        Account a2 = new Account(c1, CurrencyList.MDL, AccountType.SAVINGS);

        Withdraw withdrawOperation = new Withdraw(15000, a1);
        Deposit depositOperation = new Deposit(50000, a1);

        Thread t1 = new Thread(withdrawOperation);
        Thread t2 = new Thread(depositOperation);

        t1.start();
        t2.start();
        a1.getBalance();

        System.out.println("=========================================================");

        Thread t3 = new Thread(()->{
            try{
                a1.transfer(a2,250);
                System.out.println( "\u001B[31m" +
                        "Transfered 250" + a1.getCurrency() +
                        " from " + a1.getAccountNumber() + " to: " + a2.getAccountNumber()+ "\u001B[0m");
                System.out.println("\u001B[31m" + "Current balance:"+ "\u001B[0m");
                System.out.println("\u001B[31m" + a1.getAccountNumber() + ": " + a1.getBalance() + a1.getCurrency()+ "\u001B[0m");
                System.out.println("\u001B[31m" + a2.getAccountNumber() + ": " + a2.getBalance() + a2.getCurrency() + "\u001B[0m");
            } catch (Exception e) {
                e.getMessage();
            }
        });
        Thread t4 = new Thread(()->{
            try{
                a2.transfer(a2,50);
                System.out.println("\u001B[35m" +
                        "Transfered 50 " + a2.getCurrency() +
                        " from " + a2.getAccountNumber() + " to: " + a1.getAccountNumber()+ "\u001B[0m");
                System.out.println("\u001B[35m" +"Current balance:"+ "\u001B[0m");
                System.out.println("\u001B[35m" + a2.getAccountNumber() + ": " + a2.getBalance() + a2.getCurrency()+ "\u001B[0m");
                System.out.println("\u001B[35m" + a1.getAccountNumber() + ": " + a1.getBalance() + a1.getCurrency() + "\u001B[0m");
            } catch (Exception e) {
                e.getMessage();
            }
        });


        t3.start();
        t4.start();


    }
}
