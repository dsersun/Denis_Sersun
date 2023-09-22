package homework_nr_7;

public class Main {

    public static void main (String[] args) {

        Manager manager1 = new Manager (
                "Robert",
                "Johnson",
                "SilverStream Financial Services",
                12,
                "Sales department");

        Manager manager2 = new Manager (
                "Andrei",
                "Ionescu",
                "SilverStream Financial Services",
                8,
                "Accounting");

        Programer programer1 = new Programer (
                "James",
                "Anderson",
                "TechFusion Solutions, Inc. ",
                "Java, Scala",
                3
        );

        Programer programer2 = new Programer (
                "Elena",
                "Popescu",
                "TechFusion Solutions, Inc. ",
                "PHP",
                3
        );

        System.out.println ("------ Apply methods on created object created from abstract class ------\n");

        manager1.printMyName ();
        manager1.work ();
        System.out.println ("--------------------------------");

        manager2.printMyName ();
        manager2.work ();
        System.out.println ("--------------------------------");

        programer1.printMyName ();
        programer1.work ();
        System.out.println ("--------------------------------");

        programer2.printMyName ();
        programer2.work ();

        System.out.println ("\n------ Create array person and apply work methods only for managers using 'instanceof' ------\n");
        Person[] person = new Person[]{manager1, manager2, programer1, programer2};

        for (int i = 0; i != person.length; i++) {
            if (person[i] instanceof Manager) {
                ((Manager) person[i]).work ();
            } else {
                System.out.println (person[i].name + " " + person[i].surname + " isn't manager");
            }
        }

        System.out.println ("*****************************************");
        PensionedPerson p = new PensionedPerson ("Elena", "Ciorba",
                "15/08/2022", 63, "7560 EUR.");

        p.doYouWork ();
    }
}
