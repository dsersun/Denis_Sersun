package homework_nr_5;

import java.math.BigInteger;

public class HomeWorkNr5 {
    public static void main (String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = numbers.length - i;
        }

        int sumOfEvenValue = 0;
        BigInteger productOfOddValue = new BigInteger("1");

        for (int i = 0; i != numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfEvenValue += numbers[i];
            }
            else {
                productOfOddValue = productOfOddValue.multiply (BigInteger.valueOf (numbers[i]));
            }
        }

        int[] copyNumbers = new  int[100];
        System.arraycopy (numbers, 0, copyNumbers, 0, numbers.length);


        // print result!
        System.out.println ("Initial array!");
            PrintResult(numbers);
        System.out.println ('\n' + "----------------------------------------------------------------");
            System.out.println ("Summa of Even from 0 " + " to " + numbers.length + " = " + sumOfEvenValue);
            System.out.println ("Product of Odd value in array from 0 " + " to " + numbers.length + " = " + productOfOddValue);
        System.out.println ("----------------------------------------------------------------");

        System.out.println ("Printed copy of array!");
            PrintResult(copyNumbers);
    }


    // define method for print in concole  initial or resulted list
    private static void PrintResult(int[] num){
        for (int i = 0; i != num.length; i++) {
            if (i % 20 == 0){
                System.out.print (num[i] + ", ");
                System.out.println();
            }
            else {
                System.out.print (num[i] + ", ");
            }
        }
    }

}
