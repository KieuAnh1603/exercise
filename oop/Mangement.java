package oop;

import java.util.ArrayList;
import java.util.List;

public class Mangement implements IManager {
    private List<Staff> staffsList;
    private List<Produce> producesList;

    public Mangement() {
        staffsList = new ArrayList<>();
        producesList = new ArrayList<>();
    }

    @Override
    public void AddItem(Produce item) {
        this.producesList.add(item);
    }

    @Override
    public void Display() {
        System.out.println("All Staff");
        for (Staff staff : staffsList) {
            staff.InfoStaff();
        }
        System.out.println("All Produce");
        for (Produce produce : producesList) {
            produce.Display();
        }
    }

    @Override
    public void AddStaff(Staff staff) {
        this.staffsList.add(staff);
    }

    public Staff GetStaffByID(int index) {
        return staffsList.get(index);
    }
    
}
