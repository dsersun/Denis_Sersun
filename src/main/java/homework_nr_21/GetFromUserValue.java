package homework_nr_21;

import homework_nr_21.SQL.Limits;

import java.util.Scanner;

public interface GetFromUserValue {
    Scanner scanner = new Scanner(System.in);

    static int getAgeFromUser() {
        int age;
        do {
            System.out.print("Insert student age: (from " + Limits.minAge.value + " to " + Limits.maxAge.value + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid age (integer).");
                System.out.print("Insert student age: (from " + Limits.minAge.value + " to " + Limits.maxAge.value + "): ");
                scanner.next();
            }
            age = scanner.nextInt();
        } while (age < Limits.minAge.value || age > Limits.maxAge.value);

        return age;
    }

    static int getGradeFromUser() {
        int grade;
        do {
            System.out.print("Insert sgrade: (from " + Limits.minGrade.value + " to " + Limits.maxGrade.value + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid grade (integer).");
                System.out.print("Insert grade: (from " + Limits.minGrade.value + " to " + Limits.maxGrade.value + "): ");
                scanner.next();
            }
            grade = scanner.nextInt();
        } while (grade < Limits.minGrade.value || grade > Limits.maxGrade.value);
        return grade;
    }


}
