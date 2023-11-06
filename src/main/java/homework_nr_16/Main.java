package homework_nr_16;

import java.io.*;
public class Main {
    public static void main (String[] args) {
        final File inputFile = new File ("src/main/java/homework_nr_16/workFiles/input.txt");

        FileProcessor p = new FileProcessor ();

        p.FileHandler (inputFile);

    }
}
