package bonus_hw_1;

public class BankAccount {
    // sett color
    String reset = "\u001B[0m"; // Reset to default color
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    private static final String ibanConstructor = "MD20AG0000000225252";
    private static Integer initAccountNumber = 10000;

    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountHolderName) {
        this.accountNumber = ibanConstructor.concat(String.valueOf(initAccountNumber++));
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0;  // initial balance == 0;
    }

    public void supplyAccount(double amount){
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println(green + "Operation completed successfully!" + reset);
        }
        else {
            System.out.println(red + "Unsuccessful operation. The amount to top up your account must be greater than 0!" + reset);
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            if (this.accountBalance >= amount){
                this.accountBalance -= amount;
                System.out.println(green + "Operation completed successfully!" + reset);
            } else {
                System.out.println(red + "There is insufficient account balance for the current withdrawal.\n" + reset +
                        "Current balance: " + this.accountBalance);
            }
        } else if (amount == 0) {
            System.out.println(red + "You did not specify the amount to withdraw!" + reset);
        } else {
            System.out.println(red + "The withdrawal amount cannot be negative" + reset);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
