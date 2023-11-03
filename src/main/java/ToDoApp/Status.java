package ToDoApp;

public enum Status {
    TODO("To-Do"),
    IN_PROGRESS("In progress"),
    DONE("Done");


    private final String statusDescription;
    Status(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusDescription() {
        return statusDescription;
    }
}
