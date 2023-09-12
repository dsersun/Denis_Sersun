package homework_nr_4;

public class TemperatureConverter {
    public static void main (String[] args) {
        TemperatureConverter converter = new TemperatureConverter ();

        float t1 = converter.toCelsius(90F);
        float t2 = converter.toFahrenheit(22F);

        System.out.println (t1);
        System.out.println (t2);
    }

    private float toFahrenheit (float temp) {
        return (float) (temp*1.8)+32;
    }

    private float toCelsius (float temp) {
        return (float) ((temp-32)/1.8);
    }
}
