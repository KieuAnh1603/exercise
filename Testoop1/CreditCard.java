package Testoop1;

public class CreditCard extends Payment implements IPaymentMethod{
     private String cardNumber;
    private String cvv;
    // private String expiry;

    public CreditCard(String transactionId, double amount, String cardNumber, String cvv){
        super(transactionId, amount);
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        // this.expiry=expiry;
    }
        
    @Override
    public void Pay(double amount) {
        System.out.println("Chuyen: " + amount + " toi Cardnumber: " + cardNumber);
    }
    
    @Override
    public String GetPaymentDetails() {
        return "CreditCard: " + cardNumber + " , CVV: " + cvv;
    }

    @Override
    public void ProcessPayment() {
        System.out.println("CreditCard process transaction: " + getTransactionId());
        this.Pay(getAmount());
    }
}
