import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("Pratham", "Kaustubh", "Tanaya", "Shreya", "Prachi");
        List<String>new_list = names.stream().filter(x -> x.length() >= 7)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(new_list);
//                .forEach(x -> System.out.println(x));

        List<String>names1 = Arrays.asList("Pratham", "Kaustubh", "Tanaya", "Shreya", "Prachi");
        boolean mr1 = names1.stream().anyMatch(s -> s.startsWith("p"));
        boolean mr2 = names1.stream().allMatch(s -> s.startsWith("A"));
        boolean mr3 = names1.stream().noneMatch(s -> s.startsWith("Z"));
        System.out.println(mr1 + " " + mr2 + " " + mr3);
    }
}
