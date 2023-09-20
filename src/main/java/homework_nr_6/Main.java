package homework_nr_6;

public class Main {
    public static void main (String[] args) {
        // test the first task from homework nr. 6
        Employee employee351 = new Employee ("Robert Miller", 33, "Sales");
        System.out.println ("Employee " + employee351.getName () + " work in " +
                employee351.getDepartment () + " department and he is " + employee351.getAge () +
                " years old!");

        employee351.setDepartment ("IT");
        System.out.println ("Employee " + employee351.getName () + " work in " +
                employee351.getDepartment () + " department and he is " + employee351.getAge () +
                " years old!");
        System.out.println ("\n");


        // test the second task from homework nr. 6
        Invoice _654616565 = new Invoice (
                "Laptop",
                "16-inch MacBook Pro - Space Gray, Apple M2 Max, 96GB RAM, 8TB SSD.",
                2,
                6998.98);

        System.out.println ("Total amount: " + _654616565.getAmount () + " USD");
        _654616565.setUnitPrice (5999.99);

        // method printInvoice use more other methods from Invoice Class.
        _654616565.printInvoice ();


        // test the last task from homework nr. 6
        Date data = new Date ();
        data.setYear (2023);
        data.setMonth (2);
        data.setDate (29);

        data.displayDate ();

        Date data2 = new Date ();
        data2.setYear (2023);
        data2.setMonth (2);
        data2.setDate (28);

        data2.displayDate ();
    }
}
