package homework_nr_21.SQL;

import static java.lang.invoke.VarHandle.AccessMode.SET;

public enum SQL_Statement {
    INSERT_VALUE("INSERT INTO StudentsTable (name, age, grade) VALUES (?,?,?);"),
    UPDATE_VALUE("UPDATE StudentsTable SET grade = ? WHERE id = ?"),
    DELETE_VALUE("DELETE FROM StudentsTable WHERE id = ?;"),
    GET_ALL_VALUE("SELECT * FROM StudentsTable");

    public final String query;

    SQL_Statement(String query) {
        this.query = query;
    }
}
