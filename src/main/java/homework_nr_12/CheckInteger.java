package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD(n -> n % 2 != 0, "Odd"),
    CHECK_IF_EVEN(n -> n % 2 == 0, "Even"),
    CHECK_IF_NEGATIVE(n -> n < 0," Negative"),
    CHECK_IF_POSITIVE(n -> n > 0, "Positive");

    private Predicate<Integer> predicate;
    private String description;

    public String getDescription() {
        return description;
    }

    public boolean test(int number) {
        return predicate.test(number);
    }

    CheckInteger(Predicate<Integer> predicate, String description) {
        this.predicate = predicate;
        this.description = description;
    }
}
