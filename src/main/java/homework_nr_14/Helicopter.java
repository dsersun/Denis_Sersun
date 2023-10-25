package homework_nr_14;


import lombok.Getter;

@Getter
public class Helicopter extends Vehicle implements AirTransport{
    private int MaxFlightAltitude;

    public Helicopter(String color, String name, int maxFlightAltitude) {
        super(color, name);
        MaxFlightAltitude = maxFlightAltitude;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fly");
    }
}
