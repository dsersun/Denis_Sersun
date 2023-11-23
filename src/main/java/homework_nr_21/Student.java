package homework_nr_21;

import homework_nr_21.SQL.SQL_Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student implements GetFromUserValue {

    /*****************************************************************
     * Add new student in table based on value obtained from user    *
     *****************************************************************/
    public static void AddStudent() {
        // Get students data from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert student name and surname: ");
        String name = scanner.nextLine();
        int age = GetFromUserValue.getAgeFromUser();
        int grade = GetFromUserValue.getGradeFromUser();

        try (Connection connection = DB_Connector.getConnect()) {
            // Prepare statement
            assert connection != null;
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_Statement.INSERT_VALUE.query)) {
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setInt(3, grade);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Data has been successfully added to the database!");
                } else {
                    System.out.println("Failed to add data to the database.");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    /*****************************************************************
     * Update student grade value based on id obtained from user     *
     *****************************************************************/
    public static void UpdateGrade() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert student id for update grade: ");
        int student_id = scanner.nextInt();
        int grade = GetFromUserValue.getGradeFromUser();

        try (Connection connection = DB_Connector.getConnect()) {
            assert connection != null;
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_Statement.UPDATE_VALUE.query)) {
                preparedStatement.setInt(1, grade);
                preparedStatement.setInt(2, student_id);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Data has been successfully updated into the database!");
                } else {
                    System.out.println("Failed update data to the database.");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    /*****************************************************************
    * Delete student value from table based on id obtained from user *
    ******************************************************************/
    public static void DeleteStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert student id for delete: ");
        int studentID_forDelete = scanner.nextInt();


        try (Connection connection = DB_Connector.getConnect()) {
            assert connection != null;
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_Statement.DELETE_VALUE.query)) {
                preparedStatement.setInt(1, studentID_forDelete);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Student has been successfully deleted from database.");
                } else {
                    System.out.println("Failed delete.");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /*****************************************************************
     * Print student value from table                                *
     *****************************************************************/
    public static void ViewAllStudents() {

        try (Connection connection = DB_Connector.getConnect()) {
            assert connection != null;
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_Statement.GET_ALL_VALUE.query)) {
                ResultSet resultSet = preparedStatement.executeQuery();

                // Print the column names
                System.out.printf("%-5s%-30s%-5s%-5s%n", "ID", "Name", "Age", "Grade");
                System.out.println("-----------------------------------------------");

                // Print the values
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    int grade = resultSet.getInt("grade");

                    System.out.printf("%-5d%-30s%-5d%-5d%n", id, name, age, grade);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("An error occurred while trying to retrieve data from the database");
        }
    }
}
