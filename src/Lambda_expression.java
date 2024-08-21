import java.util.*;
interface MathOp {
    int operation(int a, int b);
}
public class Lambda_expression {
    public static void main(String[] args) {
        MathOp add = (a, b) -> a+b;
        MathOp sub = (a, b) -> a-b;
        System.out.println(add.operation(10, 10));
        System.out.println(sub.operation(67,  69));
    }
}
