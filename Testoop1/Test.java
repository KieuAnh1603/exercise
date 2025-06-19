package Testoop1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // List<Payment> CacGiaodich = new ArrayList<>();
        // CacGiaodich.add(new BankTransfer("TS160309", 10000, "14708442", "MBbank"));
        // CacGiaodich.get(0).ProcessPayment();
        // System.out.println("Chi tiet: "+ ((IPaymentMethod)CacGiaodich.get(0)).GetPaymentDetails());

        // CacGiaodich.add(new CreditCard("TS112233", 3000000, "15451541", "kta"));
        // CacGiaodich.get(1).ProcessPayment();
        // System.out.println("Chi tiet: "+ ((IPaymentMethod)CacGiaodich.get(1)).GetPaymentDetails());


        // CacGiaodich.add(new Ewallet("TS456874", 800000, "11554488", "Kieu tuan anh"));
        // CacGiaodich.get(2).ProcessPayment();
        // System.out.println("Chi tiet: "+ ((IPaymentMethod)CacGiaodich.get(2)).GetPaymentDetails());




        Payment s;
        s = new CreditCard("TS112233", 3000000, "15451541", "kta");
        s.ProcessPayment();
        s = new BankTransfer("TS160309", 10000, "14708442", "MBbank");
        s.ProcessPayment();
    }

}
