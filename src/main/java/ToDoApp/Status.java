package ToDoApp;

public enum Status {
    TODO (Color.RESET + "" + Color.YELLOW + "К выполнению" + Color.RESET),
    IN_PROGRESS (Color.RESET + "" + Color.YELLOW + "В процессе" + Color.RESET),
    DONE (Color.RESET + "" + Color.GREEN + "Выполнена" + Color.RESET);


    private final String statusDescription;

    Status (String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusDescription () {
        return statusDescription;
    }
}
