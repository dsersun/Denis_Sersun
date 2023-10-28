package homework_nr_15;

import lombok.Getter;
import java.util.Comparator;

@Getter
public class Car implements Comparable<Car> {
    private final Integer yearMade;
    private final String name;

    public Car (Integer yearMade, String name) {
        this.yearMade = yearMade;
        this.name = name;
    }

    @Override
    public int compareTo (Car otherCar) {
        // Сравниваем автомобили по убыванию года выпуска
        return Comparator.comparingInt(Car::getYearMade)
                .reversed() // для убывающего порядка
                .compare(this, otherCar);
        }

    @Override
    public String toString() {
        return "Car{" +
                "yearMade=" + yearMade +
                ", name='" + name + '\'' +
                '}';
    }
}
