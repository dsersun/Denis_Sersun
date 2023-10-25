package homework_nr_14;

import lombok.Getter;

@Getter
public class Airplane extends Vehicle implements AirTransport{
    private final int MaxFlightAltitude;
    private final int MaxSeats;

    public Airplane(String color, String name, int maxFlightAltitude, int maxSeats) {
        super(color, name);
        MaxFlightAltitude = maxFlightAltitude;
        MaxSeats = maxSeats;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fly!");
    }
}
