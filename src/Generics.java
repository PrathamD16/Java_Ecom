import java.util.*;
class Calculator<T>{
    T num1, num2;
    Calculator(T num1,  T num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public T add(){
        if(!(num1 instanceof String) && !(num2 instanceof String)){
            return (T)(Number)((Double) num1 + (Double) num2);
        }
        return null;
    }


}

class Box<T>{
    T arr[];
    Box(T arr[]){
        this.arr = arr;
    }

    void print(){
        for(T x: arr){
            System.out.println(x);
        }
    }
}
public class Generics {
    public static void main(String[] args) {
        Calculator<Double>obj = new Calculator<>(34.23131, 21.23131);
        System.out.println(obj.add());

        Integer []arr = {1,2,3,4};
        Box<Integer>obj1 = new Box<>(arr);
        obj1.print();
    }
}
