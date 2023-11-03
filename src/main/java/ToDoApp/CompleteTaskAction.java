package ToDoApp;

public class CompleteTaskAction implements TaskAction {
    private Task task;

    public CompleteTaskAction (Task task) {
        this.task = task;
    }

    // make status - Done
    @Override
    public void perform () throws TaskActionException {
        if (task.getTaskStatus () != Status.DONE) {
            task.setTaskStatus (Status.DONE);
            //System.out.println ("Task obtain status " + task.taskStatus.getStatusDescription ());
        }
    }
}
