package Quanlydonhang;

public class Electronics extends Product {

    public Electronics(String name, double kg) {
        super(name, kg);
        
    }

    

    @Override
    public double caculateTax() {
        return getKg()*10;
    }

    @Override
    public double caculateShippingFee() {
        return caculateTax() + 20;
    }

    @Override
    public void InGia() {
        System.out.println("Phi van chuyen (tinh ca thue) la: " + caculateShippingFee()+" Nghin dong");
    }
    
}
