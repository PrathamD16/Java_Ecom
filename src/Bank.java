import java.util.*;

class Account {
    int id = 1001;
    private int balance = 1000;

    void deposit(int amt){
        if(amt > 0){
            balance += amt;
        }
        else{
            System.out.println("Enter valid amount");
        }
    }

    void withdraw(int amt){
        if(amt <= balance && amt > 0){
            balance -= amt;
        }
        else{
            System.out.println("Enter valid amount");
        }
    }

    int getBalance(){
        return balance;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("Balance is: " + a.getBalance());
        a.withdraw(300);
        System.out.println("Balance is: " + a.getBalance());
        a.deposit(2000);
        System.out.println("Balance is: " + a.getBalance());
        a.withdraw(10000);
        System.out.println("Balance is: " + a.getBalance());

    }
}
