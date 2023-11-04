package ToDoApp;

public enum Priority {
    LOW (Color.RESET + "" + Color.YELLOW + "Низкий" + Color.RESET),
    MEDIUM (Color.RESET + "" + Color.CYAN + "Средний" + Color.RESET),
    HIGH (Color.RESET + "" + Color.RED + "Высокий" + Color.RESET);

    private final String PriorityDescription;

    Priority (String PriorityDescription) {
        this.PriorityDescription = PriorityDescription;
    }

    public String getPriorityDescription () {
        return PriorityDescription;
    }
}
