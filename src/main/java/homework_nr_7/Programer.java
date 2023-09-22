package homework_nr_7;

public class Programer extends Employee {
    private final String programingLanguage;
    private final int yearsOfExperience;

    public Programer (String name, String surname, String companyName,
                      String programingLanguage, int yearsOfExperience) {
        super (name, surname, companyName);
        this.programingLanguage = programingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work () {
        System.out.println ("Developer " + name + " " + surname +
                " codding in " + programingLanguage + " " + yearsOfExperience + " years!");
    }

    @Override
    public void printMyName () {
        super.printMyName ();
    }
}
