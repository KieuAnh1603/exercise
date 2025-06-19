package oop;

public class Salary {
    private float perHour;

    public Salary(float perHour) {
        this.perHour = perHour;
    }

    public double payroll(float hourWork) {
        return  hourWork * perHour;
    }

    public float getPerHour() {
        return perHour;
    }
}
