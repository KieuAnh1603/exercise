package Quanlydonhang;

public abstract class Product {
    private String name;
    private double price;
    private double kg;

    public Product(String name, double kg){
        this.name=name;
        this.kg=kg;
    }
    public double getKg() {
        return kg;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public abstract double caculateTax();
    public abstract double caculateShippingFee();
    public abstract void InGia();
}
