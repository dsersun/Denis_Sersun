package homework_nr_21;

public class Main {
    public static void main(String[] args) {
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
