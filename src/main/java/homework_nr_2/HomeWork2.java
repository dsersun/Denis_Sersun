package homework_nr_2;

public class HomeWork2 {
    public static void main (String[] args) {
        System.out.println ("Hello World!");
        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        float Pi = 3.14159F;
        boolean JavaIsAmazing = true;
        System.out.println (CurrentWorldPopulation);
        System.out.println (CarsProducedThisYear);
        System.out.println (FirstLetterInAlphabet);
        System.out.println (Pi);
        System.out.println (JavaIsAmazing);

        //  6 point in homework
        double price = 10.99;
        double tax = price * 0.2; // VAT for exemple
        int quantity = 7;
        double sum = 0;

        double total = price + tax * quantity + sum;
        // Но логичней если говорить о tax & price мо мне = (price + tax) * quantity + sum

        // вывод
        System.out.println (total);

    }

}
