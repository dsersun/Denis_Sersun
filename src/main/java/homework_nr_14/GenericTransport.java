package homework_nr_14;

import lombok.Data;
@Data
public class GenericTransport <T extends Vehicle & AirTransport> {
    private T vehicle;

    public GenericTransport(T vehicle) {
        this.vehicle = vehicle;
    }
}
