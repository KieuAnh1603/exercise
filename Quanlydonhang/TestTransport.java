package Quanlydonhang;

import java.util.ArrayList;
import java.util.List;

import oop.Mangement;

public class TestTransport {
    public static void main(String[] args) {
        List<Product> sanpham = new ArrayList<>();
        sanpham.add(new Clothing("10 cai ao thun", 0.5));
        for (Product sp : sanpham) {
            sp.caculateTax();
            sp.caculateShippingFee();
            sp.InGia();
        }
    }
}

 