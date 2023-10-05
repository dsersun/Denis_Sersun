package bonus_hw_1;

import java.util.InputMismatchException;

public class Main {
   public static void main(String[] args) {
       // sett color
       String reset = "\u001B[0m"; // Reset to default color
       String red = "\u001B[31m";
       String green = "\u001B[32m";
       Bank bank = new Bank();
       System.out.println(red +"""
                                 Welcome to your simple Bank Application!!!
               Pleas press <Enter> button 2 times to start new session, or close application now!""" + reset);
       while (true) {
           bank.scanner.nextLine();
           bank.scanner.nextLine();
           System.out.println("+-----------------------------------------------------------------------------+");
           System.out.println("|                                 "+ green + "Main menu:" + reset + "                                  |");
           System.out.println("|                          (Select cod of operation)                          |");
           System.out.println("|                                                                             |");
           System.out.println("| " + green + "1" + reset + " - Open New Account                                                        |");
           System.out.println("| " + green + "2" + reset + " - List of Accounts                                                        |");
           System.out.println("| " + green + "3" + reset + " - Deposit amount to account                                               |");
           System.out.println("| " + green + "4" + reset + " - Withdraw amount from account                                            |");
           System.out.println("| " + green + "5" + reset + " - List of operation                                                       |");
           System.out.println("|                                                                             |");
           System.out.println("| " + red + "0" + reset + " - Exit                                                                    |");
           System.out.println("+-----------------------------------------------------------------------------+");
           System.out.print(green + "Enter cod of operation: >> "+ reset);

           try {
               int choice = bank.scanner.nextInt();
               switch (choice) {
                   case 1:
                       bank.newAccount();
                       break;
                   case 2:
                       bank.listAccounts();
                       break;
                   case 3:
                       bank.deposit();
                       break;
                   case 4:
                       bank.withdraw();
                       break;
                   case 5:
                       bank.operationsList();
                       break;
                   case 0:
                       bank.stopApplication();
                       return;
                   default:
                       System.out.println(red + "Invalid input. Please select an action from the menu."+ reset);
               }
           } catch (InputMismatchException e){
               System.out.println("Please enter only digit value from menu:\nTry again");
           } finally {
               System.out.println("Press <Enter>, to continue ...");
           }
       }
   }
}
