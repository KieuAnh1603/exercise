package oop;

public class Test {
    public static void main(String[] args) {
        Mangement manager = new Mangement();
        manager.AddItem(new Produce(0, "kem", 15));
        manager.AddStaff(new Staff(0,"Kieu Tung"));

        manager.Display();
    }
}
