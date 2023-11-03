package ToDoApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        TaskManager tm = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Priority priority = null;

        try {
            while (true) {
                System.out.println ("Выберите действие:");
                System.out.println ("1. Добавить задачу");
                System.out.println ("2. Пометить задачу как В Процессе");
                System.out.println ("3. Пометить задачу как выполненную");
                System.out.println ("4. Отобразить список задач");
                System.out.println ("5. Удалить задачу");
                System.out.println ("6. Выйти");
                int choice = scanner.nextInt ();
                scanner.nextLine (); // Считываем перевод строки

                switch (choice) {
                    case 1:
                        System.out.print ("Введите название задачи: ");
                        String title = scanner.nextLine ();
                        System.out.print ("Введите описание задачи: ");
                        String description = scanner.nextLine ();
                        System.out.print ("Введите приоритет задачи (LOW, MEDIUM, HIGH): ");
                        String priorityString = scanner.nextLine ().toUpperCase ();
                        try {
                            priority = Priority.valueOf (priorityString);
                        } catch (IllegalArgumentException ignored) {

                        }

                        System.out.print ("Введите дедлайн (гггг-мм-дд): ");
                        String deadlineStr = scanner.nextLine ();
                        Status status = Status.TODO;
                        try {
                            LocalDate deadline = LocalDate.parse (deadlineStr, formatter);
                            if (priority == null) priority = Priority.LOW; // default priority is LOW
                            AddTaskAction addAction = new AddTaskAction (tm, title, description, priority, deadline, status);
                            addAction.perform ();
                            System.out.println ("Задача добавлена.");
                        } catch (TaskActionException e) {
                            System.out.println ("Ошибка: " + e.getMessage ());
                        } catch (DateTimeParseException e) {
                            System.err.println ("Incorrect format for Task deadline " + e.toString ());
                        }
                        break;

                    case 2:
                        // make In Progress
                        tm.displayTasks ();
                        System.out.print ("Введите номер задачи к выполнению: ");
                        int taskIndex = scanner.nextInt ();
                        scanner.nextLine (); // Считываем перевод строки

                        if (taskIndex >= 0 && taskIndex < tm.getTasks ().size ()) {
                            Task selectedTask = tm.getTasks ().get (taskIndex);
                            tm.InProgressTask (selectedTask);
                            System.out.println ("Задача помечена как - В Процессе.");
                        } else {
                            System.out.println ("Неверный номер задачи.");
                        }
                        break;

                    case 3:
                        tm.displayTasks ();
                        System.out.print ("Введите номер задачи для завершения: ");
                        int taskIndex2 = scanner.nextInt ();
                        scanner.nextLine (); // Считываем перевод строки

                        if (taskIndex2 >= 0 && taskIndex2 < tm.getTasks ().size ()) {
                            Task taskToComplete = tm.getTasks ().get (taskIndex2);
                            tm.completeTask (taskToComplete);
                            System.out.println ("Задача помечена как выполненная.");
                        } else {
                            System.out.println ("Неверный номер задачи.");
                        }
                        break;

                    case 4:
                        tm.displayTasks ();
                        break;
                    case 5:
                        tm.displayTasks ();
                        System.out.print ("Введите номер задачи для удаления: ");
                        int taskIndex3 = scanner.nextInt ();
                        scanner.nextLine (); // Считываем перевод строки

                        if (taskIndex3 >= 0 && taskIndex3 < tm.getTasks ().size ()) {
                            Task taskToDelete = tm.getTasks ().get (taskIndex3);
                            tm.deleteTask (taskToDelete);
                            System.out.println ("Задача удалена.");
                        } else {
                            System.out.println ("Неверный номер задачи.");
                        }
                        break;
                    case 6:
                        System.out.println ("Программа завершена.");
                        scanner.close ();
                        System.exit (0);
                        break;

                    default:
                        System.out.println ("Неверный выбор. Попробуйте снова.");

                }
            }
        }catch (InputMismatchException e) {
            System.err.println ("You input incorrect value. Only integer is accepted. " + e.toString ());
        }
    }
}

