package Quanlydonhang;

public class Clothing extends Product{
    public Clothing(String name, double kg){
        super(name,kg);
    }
    

    @Override
    public double caculateTax() {
        return getKg()*5;
    }

    @Override
    public double caculateShippingFee() {
        return caculateTax() + 10;
    }
    @Override
    public void InGia() {
        System.out.println("Phi van chuyen (tinh ca thue) la: " + caculateShippingFee()+" Nghin dong");
    }
    
    
}
