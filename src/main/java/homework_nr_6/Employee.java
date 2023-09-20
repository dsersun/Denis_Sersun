package homework_nr_6;

public class Employee {
    private final String name;
    private int age;
    private String department;

    public Employee (String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // i'm add getter and setter methods for test this class in class Main
    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getDepartment () {
        return department;
    }

    public void setDepartment (String department) {
        this.department = department;
    }
}
