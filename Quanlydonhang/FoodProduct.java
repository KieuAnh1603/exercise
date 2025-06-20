package Quanlydonhang;

public class FoodProduct extends Product{

    public FoodProduct(String name, double kg) {
        super(name, kg);
    }

    

    @Override
    public double caculateTax() {
        return getKg()*7;

    }

    @Override
    public double caculateShippingFee() {
        return caculateTax() + 15;
    }

    @Override
    public void InGia() {
        System.out.println("Phi van chuyen (tinh ca thue) la: " + caculateShippingFee()+" Nghin dong");
    }
    
}
