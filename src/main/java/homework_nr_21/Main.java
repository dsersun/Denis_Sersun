package homework_nr_21;

public class Main {
    public static void main(String[] args) {

        System.out.println(System.getenv("DB_PASSWORD"));
        System.out.println(System.getenv("DB_USER"));
        System.out.println(System.getenv("DB_URL"));
        Student.AddStudent();
        Student.ViewAllStudents();

        System.out.println("***********************************************");

        Student.UpdateGrade();
        Student.ViewAllStudents();

        System.out.println("***********************************************");


        Student.DeleteStudent();
        Student.ViewAllStudents();

        System.out.println("***********************************************");

        GetFromUserValue.scanner.close();
        Student.scanner.close();
    }
}
