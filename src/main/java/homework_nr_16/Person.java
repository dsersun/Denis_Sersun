package homework_nr_16;

import lombok.Getter;

@Getter
public class Person {
    private final String name;
    private final Integer age;
    private final Double score;

    public Person (String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
