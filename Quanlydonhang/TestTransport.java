package Quanlydonhang;

import java.util.ArrayList;
import java.util.List;

public class TestTransport {
    public static void main(String[] args) {
        List<Product> sanpham = new ArrayList<>();
        Product sp1 = new Electronics("Xe dap", 1000);
        sanpham.add(new Clothing("10 cai ao thun", 0.5));
        sanpham.add(sp1);
        for (Product sp : sanpham) {
            sp.caculateTax();
            sp.caculateShippingFee();
            sp.InGia();
        }
    }
}

 