import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ShowTime {
    private String id;
    private LocalDateTime time;
    private int totalSeats;
    private int bookedSeats;
    private DateTimeFormatter formatter;

    public ShowTime(String id, LocalDateTime time, int totalSeats) {
        this.id = id;
        this.time = time;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    }

    public boolean bookSeat() {
        if (this.bookedSeats < this.totalSeats) {
            this.bookedSeats++;
            System.out.println("Dat ghe thanh cong cho suat chieu " + this.id + "!");
            return true;
        }
        System.out.println("Rat tiec, suat chieu " + this.id + " khong con ghe trong!");
        return false;
    }

    public void Display() {
        System.out.println("    Ma suat chieu: " + this.id);
        System.out.println("    Thoi gian: " + this.time.format(formatter));
        System.out.println("    Tong so ghe: " + this.totalSeats);
        System.out.println("    So ghe da dat: " + this.bookedSeats);
        System.out.println("    So ghe con trong: " + (this.totalSeats - this.bookedSeats));
        System.out.println();
    }

    public String getId() { return id; }
    public LocalDateTime getTime() { return time; }
    public int getTotalSeats() { return totalSeats; }
    public int getBookedSeats() { return bookedSeats; }
}