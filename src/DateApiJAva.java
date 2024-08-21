import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class DateApiJAva {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);
        System.out.println("Month: " + d.getMonth());
        System.out.println("Hour: " + d.getHour());
    }
}
