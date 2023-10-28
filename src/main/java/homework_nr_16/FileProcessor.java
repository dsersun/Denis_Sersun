package homework_nr_16;

import java.io.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class FileProcessor{
    public void FileHandler(File file) {
        Set<Person> people = new HashSet<> ();
        double averageScore;

        try {
            BufferedReader reader = new BufferedReader (new FileReader (file.getPath ()));
            String line;

            while ((line = reader.readLine ()) != null) {
                String[] parts = line.split (",");
                if (parts.length == 3) {
                    String name = parts[0].trim ();
                    int age = Integer.parseInt (parts[1].trim ());
                    double score = Double.parseDouble (parts[2].trim ());
                    people.add (new Person (name, age, score));
                }
            }
            reader.close ();
        } catch (
                FileNotFoundException e) {
            System.err.println ("File not found exceptions : " + e.getMessage ());
            //return;
        } catch (
                IOException e) {
            throw new RuntimeException (e);
        }

        // obtain averageScore, youngest and oldest people from input list
        averageScore = people.stream ()
                .mapToDouble (Person::getScore)
                .average ()
                .orElse (0.0);

        Person youngest = people.stream ()
                .min (Comparator.comparingInt (Person::getAge))
                .orElse (new Person ("", 0, 0.0));

        Person oldest = people.stream ()
                .max (Comparator.comparingInt (Person::getAge))
                .orElse (new Person ("", 0, 0.0));


        try {
            BufferedWriter writer = new BufferedWriter (new FileWriter ("src/main/java/homework_nr_16/workFiles/output.txt"));
            writer.write ("Средний балл: " + String.format ("%.2f", averageScore));
            writer.newLine ();
            writer.write ("Самый молодой человек: " + youngest.getName () + " (Возраст: " + youngest.getAge () + ")");
            writer.newLine ();
            writer.write ("Самый старший человек: " + oldest.getName () + " (Возраст: " + oldest.getAge () + ")");
            writer.close ();

            System.out.println ("Средний балл: " + averageScore);
            System.out.println ("Самый молодой человек: " + youngest.getName ()+ "(Возраст: " + youngest.getAge ());
            System.out.println ("Самый старший человек: " + oldest.getName () + "(Возраст: " + oldest.getAge ());

        } catch (IOException e) {
            System.err.println ("Input / output exceptions : " + e.getMessage ());
        }
    }
}
