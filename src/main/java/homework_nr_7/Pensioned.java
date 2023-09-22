package homework_nr_7;

public abstract class Pensioned extends Person {
    String retireDate;
    int age;

    public Pensioned (String name, String surname, String retireDate, int age) {
        super (name, surname);
        this.retireDate = retireDate;
        this.age = age;
    }

    public abstract void doYouWork ();
}
