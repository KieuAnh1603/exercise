import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class testFormat {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Thoi gian la: " + time.format(formatter));
    }
}
