package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main (String[] args) {
        List<Employee> listOfEmployee = new ArrayList<> ();

        // create object and automate adding in listOfEmployee
        new Employee ("Anton", "Liulenov", 34, "Sales", listOfEmployee);
        new Employee ("Arina", "Liulenova", 33, "Software Engineering", listOfEmployee);
        new Employee ("Mihai", "Triboi", 18, "Analyst", listOfEmployee);
        new Employee ("Victor", "Martinov", 38, "Manager", listOfEmployee);
        new Employee ("Andrei", "Covaliov", 18, "Software Engineering", listOfEmployee);
        new Employee ("Valeria", "Boj", 18, "TeleSales", listOfEmployee);
        new Employee ("Agafia", "Frolova", 18, "Software Engineering", listOfEmployee);

        Predicate<Employee> isSoftwareEngineer = (Employee e) -> e.getDepartment ().equals ("Software Engineering");
        Predicate<Employee> isOver20YearsOld = (Employee e) -> e.getAge () > 20;
        Predicate<Employee> startsWithA = (Employee e) -> e.getName ().startsWith ("A");

        System.out.println ("\n------------------:    >20 years");
        testEmployee (listOfEmployee, isOver20YearsOld);
        System.out.println ("\n------------------:    starts with 'A'");
        testEmployee (listOfEmployee, startsWithA);
        System.out.println ("\n------------------:    only Software Engineers");
        testEmployee (listOfEmployee, isSoftwareEngineer);
    }

    public static void testEmployee (List<Employee> inputList, Predicate<Employee> testMethod) {
        for (Employee e : inputList) {
            String space = ", ";
            if (testMethod.test (e)) {
                System.out.println (
                    e.getName () + " " + e.getSurname () + space +e.getDepartment () + space + e.getAge () + " years old!");
            }
        }
    }
}
