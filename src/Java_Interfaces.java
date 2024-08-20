import java.util.*;

class User {
    int id;
    String name;

    User(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name=" + name + "}";
    }
}

interface Booking {
    public void Book();
    public void Invoice();
}

class Railway_Booking implements Booking {
    HashMap<String, ArrayList<User>>railway;
    Scanner s;

    Railway_Booking(){
        s = new Scanner(System.in);
        railway = new HashMap<>();
        railway.put("Deccan Express", new ArrayList<>());
        railway.put("Rajdhani", new ArrayList<>());
    }

    @Override
    public void Book() {
        System.out.println("Enter name: ");
        String name = s.nextLine();
        System.out.println("Enter id: ");
        int id = s.nextInt();
        User newuser = new User(id, name);
        System.out.println("Select below train: \n1. Deccan Express\n2.Rajdhani");
        int op = s.nextInt();
        if(op == 1){
            ArrayList<User>temp = railway.get("Deccan Express");
            temp.add(newuser);
            railway.put("Deccan Express", temp);
        }
        else if(op == 2){
            ArrayList<User>temp = railway.get("Rajdhani");
            temp.add(newuser);
            railway.put("Rajdhani", temp);
        }
        else{

        }
    }

    @Override
    public void Invoice() {
        
    }

    void show(){
        railway.forEach((x, y) -> {
            System.out.println("=== List for " + x);
            ArrayList<User>temp = railway.get(x);
            for(User u: temp){
                System.out.println("id: " + u.id + " name: " + u.name);
            }
        });
    }
}

public class Java_Interfaces {
    public static void main(String[] args) {
        System.out.println();
        Railway_Booking obj = new Railway_Booking();
        obj.Book();
        obj.Book();
        obj.show();
    }
}
