package homework_nr_11;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String surname;
    private Integer age;
    private boolean isPayedByHour;

    public Person(String name, String surname, Integer age, boolean isPayedByHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
    }
}
