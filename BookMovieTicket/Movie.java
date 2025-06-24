import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private int duration;
    private List<ShowTime> showTimes;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.showTimes = new ArrayList<>();
    }

    public void addShowTimes(ShowTime showTime) {
        this.showTimes.add(showTime);
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public List<ShowTime> getShowTimes() {
        return showTimes;
    }

    public void Display() {
        System.out.println("Phim: " + title + " (Thoi luong: " + duration + " gio)");
        if (showTimes.isEmpty()) {
            System.out.println("  Chua co xuat chieu nao.");
        } else {
            System.out.println("  Cac suat chieu:");
            for (ShowTime st : showTimes) {
                st.Display();
            }
        }
    }
}