package homework_nr_15;

import java.util.*;

public class Main {

    public static void main (String[] args) {
        // Creating a HashSet of Cars Using a Comparator
        Set<Car> carSet = new HashSet<> ();
        carSet.add(new Car(2020, "Toyota"));
        carSet.add(new Car(2015, "Honda"));
        carSet.add(new Car(2018, "Ford"));
        carSet.add(new Car(2022, "Chevrolet"));
        carSet.add (new Car(2023, "BMW"));

        List<Car> sortetCarList = new ArrayList<> (carSet);
        Collections.sort (sortetCarList);

        for( Car car: sortetCarList) {
            System.out.println (car);
        }

        System.out.println ("---------------------------------------------");

        // Creating a TreeSet of Cars Using a Comparator
        Set<Car> carSet2 = new TreeSet<>(new CarComparator());
        carSet2.add(new Car(2020, "Toyota"));
        carSet2.add(new Car(2015, "Honda"));
        carSet2.add(new Car(2018, "Ford"));
        carSet2.add(new Car(2022, "Chevrolet"));
        carSet2.add (new Car(2023, "BMW"));

        for( Car car: carSet2) {
            System.out.println (car.toString ());
        }
        System.out.println ("***********************");
    }
}
