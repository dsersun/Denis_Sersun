package homework_nr_7;

public class PensionedPerson extends Pensioned {
    String monthPensia;


    public PensionedPerson (String name, String surname, String retireDate, int age, String monthPensia) {
        super (name, surname, retireDate, age);
        this.monthPensia = monthPensia;
    }



    @Override
    public void doYouWork () {
        printMyName ();
        System.out.println ("Oh no, i'm not work! I'm from " + retireDate + " are pensioned person!");
    }
}
