package homework_nr_9;

public class Main {
    public static void main (String[] args) {
        int position = 0;

        Elephant e = new Elephant ("Mohanda");
        Elephant e1 = new Elephant ("Dambo");

        System.out.println ("My name is " + e.sayMyName ());
        System.out.println ("My name is " + e1.sayMyName ());
        position = e.move (position, 2);
        position = e.move (position, 1);
        position = e.move (position, 3);
        System.out.println ("Current position of elephant " + e.getName () + " are: " + position + "!");
        e.sleep ();
        e.reproduce (e1);
        System.out.println ("--------------------------------------------------------");

        System.out.println ("The application of methods on the object created based on the abstract class" +
                "and the implementation of the Interface\n");

        Elephant2 e2 = new Elephant2 ("Elly");
        System.out.println ("My name is " + e2.sayMyName () + "!");
        e2.collectNuts ();
        e2.eatFruit ("banana");
        e2.sleep ();
        e2.reproduce (e1);
    }
}
