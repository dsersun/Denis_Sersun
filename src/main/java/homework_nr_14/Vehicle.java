package homework_nr_14;

import lombok.Data;

@Data
public class Vehicle {
    private String color;
    private String name;

    public Vehicle(String color, String name) {
        this.color = color;
        this.name = name;
    }


}
