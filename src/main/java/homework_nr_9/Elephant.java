package homework_nr_9;

public class Elephant implements Animal {
    private final String name;

    public Elephant (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }


    @Override
    public void sleep () {
        System.out.println ("The elephant " + getName () + " sleep!");
    }

    @Override
    public void reproduce (Animal partener) {
        System.out.println ("The elephant " + getName () + " are reproducing with elephant " + partener.sayMyName ());
        Animal.eat ("Vegetables");
    }

    @Override
    public String sayMyName () {
        return getName ();
    }

    @Override
    public int move (int initialPosition, int step) {
        return Animal.super.move (initialPosition, step);
    }
}
