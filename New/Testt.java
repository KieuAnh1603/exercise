package New;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Testt {
    public static void main(String[] args) {
        // Lấy thời gian hiện tại
        LocalDateTime now = LocalDateTime.now();

        // Định dạng lại thời gian (ví dụ: 19/06/2025 20:15:00)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // In ra màn hình
        System.out.println("Thời gian hiện tại là: " + now.format(formatter));
    }
}
