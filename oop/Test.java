package oop;

public class Test {
    public static void main(String[] args) {
        Mangement manager = new Mangement();
        manager.AddItem(new Produce(0, "kem", 15));
        manager.AddStaff(new Staff(0,"Kieu Tung"));

        // manager.Display();

        manager.GetStaffByID(0).getStaffName();

        Staff staff1 = manager.GetStaffByID(1);
        staff1.InfoStaff();
    }
}
