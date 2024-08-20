import java.util.*;
public class Hash_Map {
    static void print(Map<Integer, String>mp){
        mp.forEach((k, v) -> {
            System.out.println("Key: " + k + "\tvalue: " + v);
        });
    }
    public static void main(String[] args) {
        Map<Integer, String>mp = new HashMap<>();

        mp.put(3, "C");
        mp.put(1, "A");
        mp.put(2, "B");

//        print(mp);
        System.out.println(mp);
//        Set<Integer>k = mp.keySet();
//        Collection<String>v = mp.values();
//        System.out.println("Key sets: " + k);;
//        System.out.println("Values set: " + v);

        Set<Map.Entry<Integer,String>>enSet = mp.entrySet();
        System.out.println(enSet);

    }
}
