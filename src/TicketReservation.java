import java.util.*;

@FunctionalInterface
interface Booking {
    public void book();
}

class Ticket {
    int id;
    String name;
    double price;
    String data;

    public Ticket(int id, String name, double price, String data) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", data='" + data + '\'' +
                '}';
    }
}

public class TicketReservation {
    static Scanner s;
    static ArrayList<Ticket>booking;
    static int id = 100;

    static void searchTicket(){
        Booking obj = () -> {
            s = new Scanner(System.in);
            System.out.println("Enter the ticket id: ");
            int id = s.nextInt();
            
        };
    }

    static void Booking(){
        s = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = s.nextLine();
        System.out.println("Enter the date in YYYY-MM-DD");
        String date = s.nextLine();
        Ticket new_ticket = new Ticket(id, name, 409.96, date);
        id++;
        booking.add(new_ticket);
        System.out.println(" === Successfully booked the ticket === ");
        s.close();
    }


    public static void main(String[] args) {
        booking = new ArrayList<>();

    }

}
