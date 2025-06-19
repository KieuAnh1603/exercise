import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee> dsnv = new ArrayList<>();
            dsnv.add(new FullTimeEmployee("Kieu tuan anh", 160, "160309", 10000));
        // dsnv.add(new FullTimeEmployee("Kiều Tuấn Anh", 16, "160309", 10000));
        // dsnv.add(new PartTimeEmployee("Kiều Thành Tùng", 22, "050204", 12));
        // dsnv.add(new Intern("But", 2, "213"));

        for (Employee nv : dsnv) {
            nv.PaySalary();
            nv.ShowInFo();
        }
    }
}
