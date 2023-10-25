package homework_nr_14;

import lombok.Data;
import java.io.Serializable;

@Data
public class GenericClass<T extends Number & Serializable> implements Serializable {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }
}
