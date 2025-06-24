import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import de su dung Scanner

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khoi tao Scanner de doc input
        
        // --- 1. Khoi tao cac doi tuong Movie ---
        Movie movie1 = new Movie("Doraemon: Nobita va Ban Giao Huong Dia Cau", 2); // 2 gio
        Movie movie2 = new Movie("Bi Kip Luyen Rong 3: The Gioi Bi An", 3); // 3 gio
        Movie movie3 = new Movie("Tham Tu Lung Danh Conan: Ngoi Sao 5 Canh 1 Trieu Do", 1); // 1 gio

        // --- 2. Khoi tao ShowTime va them vao Movie ---

        System.out.println("--- Seeding ShowTime cho Doraemon ---");
        // Suat chieu 1: Hom nay, 14:00, 10 ghe
        movie1.addShowTimes(new ShowTime("D-001", LocalDateTime.of(2025, Month.JUNE, 24, 14, 0, 0), 10));
        // Suat chieu 2: Hom nay, 16:30, 3 ghe
        movie1.addShowTimes(new ShowTime("D-002", LocalDateTime.of(2025, Month.JUNE, 24, 16, 30, 0), 3));
        // Suat chieu 3: Hom nay, 20:00, 5 ghe
        movie1.addShowTimes(new ShowTime("D-003", LocalDateTime.of(2025, Month.JUNE, 24, 20, 0, 0), 5));
        // Suat chieu 4: Ngay mai, 10:00, 20 ghe
        movie1.addShowTimes(new ShowTime("D-004", LocalDateTime.of(2025, Month.JUNE, 25, 10, 0, 0), 20));
        System.out.println("Da them ShowTime cho Doraemon.");

        System.out.println("\n--- Seeding ShowTime cho Bi Kip Luyen Rong ---");
        // Suat chieu 1: Hom nay, 15:00, 15 ghe
        movie2.addShowTimes(new ShowTime("BR-001", LocalDateTime.of(2025, Month.JUNE, 24, 15, 0, 0), 15));
        // Suat chieu 2: Hom nay, 21:00, 8 ghe
        movie2.addShowTimes(new ShowTime("BR-002", LocalDateTime.of(2025, Month.JUNE, 24, 21, 0, 0), 8));
        System.out.println("Da them ShowTime cho Bi Kip Luyen Rong.");

        System.out.println("\n--- Seeding ShowTime cho Tham Tu Lung Danh Conan ---");
        // Suat chieu 1: Hom nay, 18:00, 12 ghe
        movie3.addShowTimes(new ShowTime("C-001", LocalDateTime.of(2025, Month.JUNE, 24, 18, 0, 0), 12));
        // Suat chieu 2: Ngay mai, 13:00, 18 ghe
        movie3.addShowTimes(new ShowTime("C-002", LocalDateTime.of(2025, Month.JUNE, 25, 13, 0, 0), 18));
        System.out.println("Da them ShowTime cho Tham Tu Lung Danh Conan.");

        System.out.println("\n--- Hien thi thong tin cac bo phim va suat chieu ban dau ---");
        movie1.Display(); 
        System.out.println("---");
        movie2.Display(); 
        System.out.println("---");
        movie3.Display(); 
        System.out.println("---");

        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(movie1);
        allMovies.add(movie2);
        allMovies.add(movie3);

        Customer customer1 = new Customer("Kieu Thanh Tung");
        char option = 'n';
        
        do {
            System.out.println("\n--- Chon phim de dat ve ---");
            // In ra ten movie cho khach hang lua chon (1,2,3)
            for (int i = 0; i < allMovies.size(); i++) {
                System.out.println((i + 1) + ". " + allMovies.get(i).getTitle());
            }
            System.out.print("Nhap so thu tu phim ban muon xem: ");
            int movieChoice = scanner.nextInt();
            
            // Xac thuc lua chon phim
            if (movieChoice < 1 || movieChoice > allMovies.size()) {
                System.out.println("Lua chon phim khong hop le. Vui long thu lai.");
                continue; // Quay lai dau vong lap
            }
            Movie selectedMovie = allMovies.get(movieChoice - 1);
            
            // In ra cac suat chieu khi khach hang lua chon movie
            System.out.println("\n--- Cac suat chieu cua phim " + selectedMovie.getTitle() + " ---");
            List<ShowTime> movieShowTimes = selectedMovie.getShowTimes();
            if (movieShowTimes.isEmpty()) {
                System.out.println("Hien tai khong co suat chieu nao cho phim nay.");
            } else {
                for (int i = 0; i < movieShowTimes.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    movieShowTimes.get(i).Display(); // Hien thi chi tiet tung suat chieu
                    System.out.println("    --------------------"); // Phan cach cac suat chieu
                }
                
                System.out.print("Nhap so thu tu suat chieu ban muon dat: ");
                int showTimeChoice = scanner.nextInt();
                
                // Xac thuc lua chon suat chieu
                if (showTimeChoice < 1 || showTimeChoice > movieShowTimes.size()) {
                    System.out.println("Lua chon suat chieu khong hop le. Vui long thu lai.");
                    continue; // Quay lai dau vong lap
                }
                ShowTime selectedShowTime = movieShowTimes.get(showTimeChoice - 1);
                
                // Thuc hien dat ve
                customer1.bookMovie(selectedMovie, selectedShowTime);
            }

            // In thong tin khach hang sau moi lan dat ve
            System.out.println("\n--- Thong tin dat ve cua ban ---");
            customer1.DisplayInfo();
            
            System.out.print("\nBan co muon tiep tuc dat ve (y/n): ");
            option = scanner.next().charAt(0);
            option = Character.toLowerCase(option); // Chuyen ve chu thuong de so sanh
            
        } while (option == 'y');
        
        System.out.println("\nCam on ban da su dung dich vu! Tam biet.");
        scanner.close(); // Dong scanner khi ket thuc chuong trinh
    }
}