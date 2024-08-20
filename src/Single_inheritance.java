import java.util.*;

class Base {
    int x;
    String name;
    public Base() {
        // System.out.println("Base constructor");
        x = 10;
        name = "Hey";
    }

    void baseMethod() {
        System.out.println("Base Method");
    }

    void print(){
        System.out.println("Value of x: " + x + " " + " Value of name: " + name);
    }
}

class Child extends Base {
    public Child() {
        System.out.println("Child Constructor");
    }

    @Override
    void baseMethod() {
        System.out.println("Override Method");
    }

    void childMethod() {
        System.out.println("Child Method");
    }

    
}

public class Single_inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.print();
    }
}