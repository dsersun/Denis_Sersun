package homework_nr_14;


import lombok.Getter;

@Getter
public class Car extends Vehicle{
    private final int nrOfWheels;

    public Car(String color, String name, int nrOfWheels) {
        super(color, name);
        this.nrOfWheels = nrOfWheels;
    }
}
