package homework_nr_8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnicValue {

    public Set<String> getUnicValue (List<String> inputList) {
        Set<String> uniqueValues = new HashSet<> ();
        for (String value : inputList) {
            uniqueValues.add (value);
        }
        return uniqueValues;
    }


}
