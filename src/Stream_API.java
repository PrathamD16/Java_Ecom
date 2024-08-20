import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream_API {
    public static void main(String[] args) {
        List<String>arr = Arrays.asList("Pineapple","Apple", "Banana", "Cherry", "apple");
        List<String>sorted = arr.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sorted);

//        Search
        List<String>arr1 = Arrays.asList("Pineapple","Apple", "Banana", "Cherry", "apple");
        Comparator<String>comparator = Comparator.comparingInt(String::length);
        Collections.sort(arr1, comparator);
        System.out.println(arr1);
        int ind = Collections.binarySearch(arr1, "apple", comparator);
        System.out.println(ind);

    }
}
