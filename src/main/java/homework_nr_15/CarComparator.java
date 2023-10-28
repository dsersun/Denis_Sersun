package homework_nr_15;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare (Car car1, Car car2) {
        return car2.getYearMade() - car1.getYearMade();
    }
}
