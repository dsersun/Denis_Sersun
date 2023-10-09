package homework_nr_9;

public class Elephant2 extends Erbivor implements Animal {
    private final String name;

    public Elephant2 (String name) {
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

    // methods from abstract class Erbivor
    @Override
    void eatFruit (String fruit) {
        System.out.println ("The elephant " + getName () + " eat the " + fruit + "!");
    }

    @Override
    public void collectNuts () {
        super.collectNuts ();
    }

}
