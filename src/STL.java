import java.util.*;
public class STL {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);

        Set<Integer>st = new HashSet<>(arr);
        // System.out.println("Array list: "  + arr);
        // System.out.println("Set: " + st);
        System.out.println("");

        st.forEach(x -> {
            System.out.println(x);
        });
    }
}
