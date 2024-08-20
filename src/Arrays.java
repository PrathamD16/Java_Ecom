import java.util.*;

class Product {
    int id;
    String prodName;
    Product(int id, String name){
        this.id = id;
        this.prodName = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + prodName;
    }
}

public class Arrays {
    static Scanner s;
    public static void main(String[] args) {
        Product p1 = new Product(1, "Sap");
        Product p2 = new Product(2, "Cloth");
        Product[] ttl = new Product[]{p1, p2};

        for(Product x: ttl){
            System.out.println(x);
        }


    }

    public void main(){

    }

}
