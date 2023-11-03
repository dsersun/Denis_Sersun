package ToDoApp;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Task {
    String taskName;
    String taskDescription;
    Priority taskPriority;
    LocalDate deadlineTask;
    Status taskStatus;

    public Task (String taskName, String taskDescription, Priority taskPriority, LocalDate deadlineTask, Status taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
        this.deadlineTask = deadlineTask;
        this.taskStatus = taskStatus;
    }
}
