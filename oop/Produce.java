package oop;

public class Produce {
    private int produceId;
    private String produceName;
    private Salary produceCost;

    public Produce(int produceId, String produceName, float produceCost) {
        this.produceId = produceId;
        this.produceName = produceName;
        this.produceCost = new Salary(produceCost);
    }

    public Salary getProduceCost() {
        return produceCost;
    }
    public int getProduceId() {
        return produceId;
    }
    public String getProduceName() {
        return produceName;
    }

    public double finishProduce(float hourWork) {
        return this.produceCost.payroll(hourWork);
    }

    public void Display() {
        System.out.println("ID: " + this.produceId);
        System.out.println("Name: " + this.produceName);
        System.out.println("Cost: " + this.produceCost.getPerHour());
    }
}
