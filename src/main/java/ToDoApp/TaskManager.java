package ToDoApp;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add (task);
    }

    public void displayTasks(){
        for(Task task : tasks) {
            System.out.println("Название: " + task.getTaskName ());
            System.out.println("Описание: " + task.getTaskDescription ());
            System.out.println("Приоритет: " + task.getTaskPriority ());
            System.out.println("Дедлайн: " + task.getDeadlineTask ());
            System.out.println("Статус: " + task.getTaskStatus ());
            System.out.println("-------------------------");
        }
    }

    public void InProgressTask(Task task) {
        task.setTaskStatus (Status.IN_PROGRESS);
        System.out.println ("Task obtain status " + task.taskStatus.getStatusDescription ());
    }
    public void completeTask(Task task) {
        CompleteTaskAction completeAction = new CompleteTaskAction(task);
        try {
            completeAction.perform ();
        } catch (TaskActionException e) {
            throw new RuntimeException (e);
        }
    }

    public void deleteTask(Task task){
        tasks.remove (task);
    }
}
