import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Product {
    int id, price;
    String name;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Lambda_Expression2 {
    static void print(ArrayList<Product>p){
        for(Product x : p){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        ArrayList<Product> shop = new ArrayList<>();
        shop.add(new Product(101, 240, "Soap"));
        shop.add(new Product(129, 300, "Bhujia"));
        shop.add(new Product(102, 100, "Harpic"));
        shop.add(new Product(105, 90, "Lizol"));

//        Comparator<Product>comp1 = Comparator.comparingInt(e -> e.price);
//        Collections.sort(shop, comp1);
//
//        Comparator<Product>comp2 = Comparator.comparing(e -> e.name);
//        Collections.sort(shop, comp2);
//
//        Comparator<Product>comp3 = Comparator.comparingInt(e -> e.id);
//        Collections.sort(shop, comp3.reversed());

        Predicate<Product> pr = p -> p.price > 200;

        shop.stream().filter(pr).forEach(x -> System.out.println(x));



//        print(shop);

    }
}
