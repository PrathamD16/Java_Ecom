import java.util.*;

class Users {
    String name;
    public Users(String name){
        this.name = name;
    }
}

public class LL {
    static LinkedList<Users>Booking, Cancelled, Waiting;
    static Scanner s;
    static int n;
    static void start(){
        Booking = new LinkedList<>();
        Cancelled = new LinkedList<>();
        Waiting = new LinkedList<>();
        s = new Scanner(System.in);
        Booking.add(new Users("A"));
        Booking.add(new Users("B"));
        Booking.add(new Users("C"));
        Booking.add(new Users("D"));
        n = 5;
    }
    public static void BookTicket(){
        String name = s.nextLine();
        Users new_user = new Users(name);
        if(Booking.size() == n){
            Waiting.add(new_user);
            System.out.println("Added to waiting list");
        }
        else{
            Booking.add(new_user);
            System.out.println("Booking Confirmed");
        }

    }
    public static void CancelTicket(){
        String name = s.nextLine();
        for(int i = 0; i < n; i++){
            if(Booking.get(i).name.equalsIgnoreCase(name)) {
                Cancelled.add(Booking.get(i));
                Booking.add(i, null);
            }

        }
    }
    public static void main(String[] args) {
        start();
        int op = 0;
        while(op != 3){
            System.out.println("1. BookTicket\n2. Cancel \n3. Exit");
            op = s.nextInt();
            switch (op){
                case 1:
                    BookTicket();
                    break;
                case 2:
                    CancelTicket();
                    break;
                default:
                    System.out.println("Enter correct Option");
            }
        }

    }
}
