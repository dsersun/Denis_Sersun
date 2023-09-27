package homework_nr_8;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        // part 1

        // LinkedList was selected due to the ToDoList logic involves adding and deleting values
        List<String> todo = new LinkedList<> ();
        todo.add ("Morning coffe");
        todo.add ("Gym");
        todo.add ("Go to the office");
        todo.add ("morning meeting");

        System.out.println ("My ToDo List for today: " + todo);
        System.out.println ("----------------------------------------");

        // part 2
        List<String> inputList = new ArrayList<> ();
        inputList.add ("Pineapple");
        inputList.add ("Apple");
        inputList.add ("Banana");
        inputList.add ("Orange");
        inputList.add ("Apple");
        inputList.add ("Banana");
        inputList.add ("Grapes");
        inputList.add ("Strawberry");
        inputList.add ("Mango");
        inputList.add ("Orange");

        System.out.print ("All values from input list: ");
        System.out.println (inputList);

        UnicValue uv = new UnicValue ();
        Set<String> uniqueVal = uv.getUnicValue (inputList);

        System.out.print ("Unique value from input list: ");
        System.out.println (uniqueVal);
        System.out.println ("----------------------------------------");

        // part 3
        Map<String, String> dictionary = new HashMap<> ();

        dictionary.put ("apple", "măr");
        dictionary.put ("banana", "banană");
        dictionary.put ("car", "mașină");
        dictionary.put ("cat", "pisică");
        dictionary.put ("book", "carte");
        dictionary.put ("dog", "câine");
        dictionary.put ("tree", "copac");
        dictionary.put ("sun", "soare");
        dictionary.put ("house", "casă");
        dictionary.put ("computer", "calculator");

        System.out.println ("Англо-румынский словарь:");
        for (Map.Entry<String, String> value : dictionary.entrySet ()) {
            String englishWord = value.getKey ();
            String romanianTranslation = value.getValue ();
            System.out.println (englishWord + " - " + romanianTranslation);
        }
    }
}
