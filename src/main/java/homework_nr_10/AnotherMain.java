package homework_nr_10;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AnotherMain{
    public static void main (String[] args) {
        Predicate<Integer> isOdd = number -> number % 2 != 0;
        Consumer<String> stringPrinter = str -> System.out.println(str);
        Function<Integer, Integer> doubleNumber = number -> number * 2;
        Supplier<Integer> randomNumberSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        System.out.println ("<<----------------------------------------------------->>");
        Integer randomNum = randomNumberSupplier.get();
        System.out.println("Random number: " + randomNum);

        Integer number = doubleNumber.apply (randomNum);
        System.out.println ("Double number: " + number);

        System.out.println (isOdd.test (randomNum));

        stringPrinter.accept ("Thank you for attention! Home work 10 is done!");
    }
}
