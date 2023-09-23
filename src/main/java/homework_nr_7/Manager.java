package homework_nr_7;

public class Manager extends Employee {
    private final int teamSize;
    private final String teamName;

    public Manager (String name, String surname, String companyName, int teamSize, String teamName) {
        super (name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work () {
        System.out.println ("Manager " + name + " " + surname +
                " lead the " + teamSize + " members of team " + teamName + "!");
    }

    @Override
    public void printMyName () {
        super.printMyName ();
    }
}
