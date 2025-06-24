import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<ShowTime> bookedShowTimes;

    public Customer(String name) {
        this.name = name;
        this.bookedShowTimes = new ArrayList<>();
    }

    public boolean bookMovie(Movie movie, ShowTime showtime) {
        if (showtime.bookSeat()) {
            this.bookedShowTimes.add(showtime);
            return true;
        }
        return false;
    }

    public void DisplayInfo() {
        System.out.println("--- Thong tin khach hang: " + this.name + " ---");
        if (this.bookedShowTimes.isEmpty()) {
            System.out.println("Khach hang nay chua dat suat chieu nao.");
        } else {
            System.out.println("Cac suat chieu da dat:");
            for (int i = 0; i < this.bookedShowTimes.size(); i++) {
                System.out.println("  Suat chieu #" + (i + 1) + ":");
                this.bookedShowTimes.get(i).Display();
            }
        }
        System.out.println("------------------------------------");
    }

    public String getName() {
        return name;
    }

    public List<ShowTime> getBookedShowTimes() {
        return bookedShowTimes;
    }
}
