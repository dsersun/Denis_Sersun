package ToDoApp;

public class CompleteTaskAction implements TaskAction {
    private final Task task;

    public CompleteTaskAction (Task task) {
        this.task = task;
    }

    @Override
    public void perform () throws TaskActionException {
        if (task.getTaskStatus () != Status.DONE) {
            task.setTaskStatus (Status.DONE);
            System.out.println ("Задача помечена как выполненная.");
        } else {
            System.out.println ("Задача уже выполнена.");
        }
    }
}
