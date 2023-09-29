package homework_nr_10;

import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private Integer age;
    private String department;

    public Employee (String name, String surname, Integer age, String department, List<Employee> listOfEmployee) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        // Automate adding created object in listOfEmployee
        listOfEmployee.add(this);
    }


    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public Integer getAge () {
        return age;
    }

    public String getDepartment () {
        return department;
    }
}
