import java.util.*;

public class Main {
    static Scanner s;
    static int final_price;
    static public void Grocer(){
        s = new Scanner(System.in);
        System.out.println("1. Milk (Rs 40 per L)\n 2. Butter (Rs 40 per 100g)");
        int op = s.nextInt();
        if(op == 1){
            System.out.println("Enter quantity: ");
            int qty = s.nextInt();
            final_price += (qty * 40);
        }
        else if(op == 2){
            System.out.println("Enter quantity: ");
            int qty = s.nextInt();
            final_price += (qty * 40);
        }
        else{
            System.out.println("Enter correct choices");
        }
    }
    static public void Clothes(){
        s = new Scanner(System.in);
        System.out.println("1. T-shirts\n 2. Jeans");
        int op = s.nextInt();
        if(op == 1){
            System.out.println("Enter quantity (per pcs): ");
            int qty = s.nextInt();
            final_price += (qty * 100);
        }
        else if(op == 2){
            System.out.println("Enter quantity (per pcs): ");
            int qty = s.nextInt();
            final_price += (qty * 90);
        }
        else{
            System.out.println("Enter correct choices");
        }
    }
    static public void homepage(){
        System.out.println("***Welcome to Shop***");
        System.out.println("Do you want to shop");
        System.out.println("1. Yes \n2. No");
        s = new Scanner(System.in);
        final_price = 0;
        int op1 = s.nextInt();
        if(op1 == 1){
            int op2 = 0;
            while(op2 != 3){
                System.out.println("1. Clothes \n2. Grocery \n3. Checkout");
                op2 = s.nextInt();
                switch (op2){
                    case 1: Clothes();
                    break;
                    case 2: Grocer();
                    break;
                    case 3: break;
                    default:
                        System.out.println("Enter correct choices");
                }
            }
            System.out.println("Total bill: " + final_price);
            s.close();
        }
        else{
            System.out.println("Bye bye");
        }

    }

    public static void main(String[] args) {
        homepage();
    }
}