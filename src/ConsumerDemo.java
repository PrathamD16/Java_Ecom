import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String>name = Arrays.asList("Swami", "Krishna", "Hari");
        Consumer<String> x = n -> n.equalsIgnoreCase("hari");
        name.forEach(x);

    }
}
