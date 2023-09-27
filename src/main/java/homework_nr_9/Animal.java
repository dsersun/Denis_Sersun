package homework_nr_9;

public interface Animal {

    static void eat (String food) {
        System.out.println ("The animals eats " + food + "!");
    }

    void sleep ();

    void reproduce (Animal partener);

    String sayMyName ();

    default int move (int initialPosition, int step) {
        return initialPosition += step;
    }
}
