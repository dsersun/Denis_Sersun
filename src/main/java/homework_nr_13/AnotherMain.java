package homework_nr_13;
import java.util.stream.IntStream;

public class AnotherMain{
    public static void main(String[] args) {
        int inferiorLimit = 1;
        int superiorLimit = 100;
        System.out.println("Print and cout the number of integers divisible by 7 between " +
                inferiorLimit + " and " + superiorLimit + "!");

        try {
            int count = countDivisibleBy7Numbers(inferiorLimit, superiorLimit);
            System.out.println("The number of integers divisible by 7 between " +
                    inferiorLimit + " and " + superiorLimit + " is: " + count);
        } catch (InvalidRangeException e) {
            System.out.println("Invalid range: " + e.getMessage());
        }
    }

    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Invalid range: inferior limit is greater than superior limit.");
        }

        // We create a stream of numbers in the range and filter only those that are divisible by 7.
        return (int) IntStream.rangeClosed(inferiorLimit, superiorLimit)
                .filter(num -> num % 7 == 0)
                .peek(i -> System.out.print(i + ", "))
                .count();
    }
}
