@FunctionalInterface
interface VoidOperation {
    void perform();
}

public class Functional_Interface {
    
    public static void main(String[] args) {
        // Using lambda expression to implement the VoidOperation interface
        VoidOperation greeting = () -> System.out.println("Hello, World!");
        VoidOperation goodbye = () -> System.out.println("Goodbye, World!");
        
        // Perform the operations
        performOperation(greeting);
        performOperation(goodbye);
    }
    
    public static void performOperation(VoidOperation voidOperation) {
        voidOperation.perform();
    }
}
