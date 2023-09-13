package homework_nr_4;

public class Circle {
    public static void main (String[] args) {
        Circle FirstCircle = new Circle(10.601);

        FirstCircle.calculateArea();

        // Acces to TemperatureConverter class method in other class
        TemperatureConverter t3 = new TemperatureConverter ();
        System.out.println (t3.toCelsius (95F));
    }

    public Circle (double radius){
        this.radius = radius;
    }

    double radius;
    public void calculateArea(){
        System.out.println ("Aria of circle with radius " + radius + " = " + Math.PI * Math.pow (radius, 2));
    }
}
