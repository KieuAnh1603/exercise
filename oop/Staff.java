package oop;

public class Staff {
    private int staffId;
    private String staffName;
    private float hourWork;
    private double staffSaraly;

    public Staff() {}

    public Staff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.hourWork = 0;
        this.staffSaraly = 0;
    }


    public float getHourWork() {
        return hourWork;
    }
    public int getStaffId() {
        return staffId;
    }
    public String getStaffName() {
        return staffName;
    }
    public double getStaffSaraly() {
        return staffSaraly;
    }

    public void setHourWork(float hourWork) {
        this.hourWork = hourWork;
    }
    public void setStaffSaraly(double staffSaraly) {
        this.staffSaraly = staffSaraly;
    }

    public void InfoStaff() {
        System.out.println("ID: " + this.staffId);
        System.out.println("Name: " + this.staffName);
        System.out.println("Hour work: " + this.hourWork);
        System.out.println("Salary: " + this.staffSaraly);
    }
}
