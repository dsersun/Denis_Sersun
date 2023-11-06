package ToDoApp;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TaskManager {
    private List<Task> tasks = new ArrayList<> ();

    public void addTask (Task task) {
        tasks.add (task);
    }

    public void displayTasks () {
        if (tasks.isEmpty ()) {
            System.out.println ("Список задач пустой!\n");
        } else {
            int index = 1;
            for (Task task : tasks) {
                System.out.println ("+-------------------Task # " + (index++) + "--------------------------+");
                System.out.println ("Название: " + Color.GREEN + task.getTaskName () + Color.RESET);
                System.out.println ("Описание: " + Color.GREEN + task.getTaskDescription () + Color.RESET);
                System.out.println ("Приоритет: " + task.getTaskPriority ().getPriorityDescription ());
                System.out.println ("Дедлайн: " + Color.GREEN + task.getDeadlineTask () + Color.RESET);
                System.out.println ("Статус: " + task.getTaskStatus ().getStatusDescription ());
                System.out.println ("+--------------------------------------------------+");
            }
        }
    }

    public void InProgressTask (Task task) {
        if (task.getTaskStatus () != Status.IN_PROGRESS) {
            task.setTaskStatus (Status.IN_PROGRESS);
            System.out.println (Color.GREEN + "Задача помечена как " + task.taskStatus.getStatusDescription ());
        } else {
            System.out.println (Color.PURPLE + "Задача уже" + task.taskStatus.getStatusDescription ());
        }
    }

    public void completeTask (Task task) {
        CompleteTaskAction completeAction = new CompleteTaskAction (task);
        try {
            completeAction.perform ();
        } catch (TaskActionException e) {
            throw new RuntimeException (e);
        }
    }

    public void deleteTask (Task task) {
        tasks.remove (task);
    }
}
