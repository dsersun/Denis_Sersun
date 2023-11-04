package ToDoApp;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AddTaskAction implements TaskAction {
    private TaskManager taskManager;
    private String taskName;
    private String taskDescription;
    private Priority taskPriority;
    private LocalDate deadlineTask;
    private Status taskStatus;

    public AddTaskAction (TaskManager taskManager, String taskName, String taskDescription,
                          Priority taskPriority, LocalDate deadlineTask, Status taskStatus) {
        this.taskManager = taskManager;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.deadlineTask = deadlineTask;
        this.taskStatus = taskStatus;
    }

    @Override
    public void perform () throws TaskActionException {
        if (taskName == null || taskName.isEmpty ()) {
            throw new TaskActionException ("Название задачи не может быть пустым.");
        }
        Task newTask = new Task (taskName, taskDescription, taskPriority, deadlineTask, taskStatus);
        taskManager.addTask (newTask);
    }
}
