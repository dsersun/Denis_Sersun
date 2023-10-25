package homework_nr_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("red","BMW", 4);

        Airplane airplane = new Airplane("white", "Cesna", 7000, 6);
        Airplane airplane2 = new Airplane("white", "Boing", 7000, 6);
        Airplane airplane3 = new Airplane("white", "Airbus", 7000, 6);
        Airplane airplane4 = new Airplane("white", "Tu", 7000, 6);
        Airplane airplane5 = new Airplane("white", "Another aitplane name", 7000, 6);

        Helicopter helicopter = new Helicopter("red", "mig",3000);

        List<Airplane> airplaneList = new ArrayList<>();
        airplaneList.addAll(Arrays.asList(airplane, airplane2, airplane3, airplane4, airplane5));

        GenericTransport<Airplane> airplaneTransport = new GenericTransport<>(airplane);
        GenericTransport<Helicopter> helicopterTransport = new GenericTransport<>(helicopter);

        // The example call with a car will cause a compilation error
        // GenericTransport<Car> carTransport = new GenericTransport<>(car);

        System.out.println(airplaneTransport.getVehicle().getName());
        System.out.println(helicopterTransport.getVehicle().getName());

        System.out.println("------------------------------------");

        System.out.println(helicopterTransport.getVehicle());
        System.out.println(airplaneTransport.getVehicle());

        System.out.println("******************");

        for (Airplane name: airplaneList) {
            System.out.println(name.getName());
        }
    }
}
