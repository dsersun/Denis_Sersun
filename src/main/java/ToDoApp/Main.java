package ToDoApp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        TaskManager tm = new TaskManager ();
        Scanner scanner = new Scanner (System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("yyyy-MM-dd");
        Priority priority = null;

        try {
            while (true) {
                System.out.println (Color.BLUE + "Выберите действие:" + Color.RESET);
                System.out.println (Color.RED + "1" + Color.RESET + ". Добавить задачу");
                System.out.println (Color.RED + "2" + Color.RESET + ". Пометить задачу как В Процессе");
                System.out.println (Color.RED + "3" + Color.RESET + ". Пометить задачу как выполненную");
                System.out.println (Color.RED + "4" + Color.RESET + ". Отобразить список задач");
                System.out.println (Color.RED + "5" + Color.RESET + ". Удалить задачу");
                System.out.println (Color.RED + "6. Выйти" + Color.RESET);
                int choice = scanner.nextInt ();
                scanner.nextLine ();

                switch (choice) {
                    case 1:
                        System.out.print ("Введите название задачи (не должно быть пустым): ");
                        String title = scanner.nextLine ();
                        System.out.print ("Введите описание задачи (если необходимо): ");
                        String description = scanner.nextLine ();
                        System.out.print ("Введите приоритет задачи (LOW, MEDIUM, HIGH): ");
                        String priorityString = scanner.nextLine ().toUpperCase ();
                        try {
                            priority = Priority.valueOf (priorityString);
                        } catch (IllegalArgumentException ignored) {
                        }
                        System.out.print ("Введите дедлайн (формат: гггг-мм-дд): ");
                        String deadlineStr = scanner.nextLine ();
                        Status status = Status.TODO; // initial default status for new task
                        try {
                            LocalDate deadline = LocalDate.parse (deadlineStr, formatter);
                            if (priority == null) priority = Priority.LOW; // default priority is LOW
                            AddTaskAction addAction = new AddTaskAction (tm, title, description, priority, deadline, status);
                            addAction.perform ();
                            System.out.println (Color.BLUE + "Задача добавлена." + Color.RESET);
                        } catch (TaskActionException e) {
                            System.err.println ("Ошибка: " + e.getMessage ());
                        } catch (DateTimeParseException e) {
                            System.err.println ("Incorrect format for Task deadline " + e.getMessage ());
                        }
                        break;
                    case 2:
                        tm.displayTasks ();
                        if (!tm.getTasks ().isEmpty ()) {
                            System.out.print ("Введите номер задачи к выполнению: ");
                            int taskIndex = scanner.nextInt ();
                            scanner.nextLine ();
                            if (taskIndex > 0 && taskIndex < tm.getTasks ().size () + 1) {
                                Task selectedTask = tm.getTasks ().get (taskIndex - 1);
                                tm.InProgressTask (selectedTask);
                            } else {
                                System.out.println (Color.RED + "Неверный номер задачи." + Color.RESET);
                            }
                        }
                        break;
                    case 3:
                        tm.displayTasks ();
                        System.out.print ("Введите номер задачи для завершения: ");
                        int taskIndex2 = scanner.nextInt ();
                        scanner.nextLine ();

                        if (taskIndex2 > 0 && taskIndex2 < tm.getTasks ().size () + 1) {
                            Task taskToComplete = tm.getTasks ().get (taskIndex2 - 1);
                            tm.completeTask (taskToComplete);
                        } else {
                            System.out.println (Color.RED + "Неверный номер задачи." + Color.RESET);
                        }
                        break;
                    case 4:
                        tm.displayTasks ();
                        break;
                    case 5:
                        tm.displayTasks ();
                        System.out.print ("Введите номер задачи для удаления: ");
                        int taskIndex3 = scanner.nextInt ();
                        scanner.nextLine ();

                        if (taskIndex3 > 0 && taskIndex3 < tm.getTasks ().size () + 1) {
                            Task taskToDelete = tm.getTasks ().get (taskIndex3 - 1);
                            tm.deleteTask (taskToDelete);
                            System.out.println (Color.RED + "Задача удалена." + Color.RESET);
                        } else {
                            System.out.println (Color.RED + "Неверный номер задачи." + Color.RESET);
                        }
                        break;
                    case 6:
                        System.out.println (Color.PURPLE + "Программа завершена." + Color.RESET);
                        scanner.close ();
                        System.exit (0);
                        break;
                    default:
                        System.out.println (Color.RED + "Неверный выбор. Попробуйте снова." + Color.RESET);
                }
            }
        } catch (InputMismatchException e) {
            System.err.println ("You input incorrect value. Only integer is accepted. " + e);
        }
    }
}
