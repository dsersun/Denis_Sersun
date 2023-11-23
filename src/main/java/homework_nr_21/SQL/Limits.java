package homework_nr_21.SQL;

public enum Limits {
    minAge(16),
    maxAge(99),
    minGrade(1),
    maxGrade(10);

    public final int value;

    Limits(int value) {
        this.value = value;
    }
}
