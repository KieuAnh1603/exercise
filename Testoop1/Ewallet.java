package Testoop1;

public class Ewallet extends Payment implements IPaymentMethod{
    private String walletId;
    private String providerName;

    public Ewallet(String transactionId, double amount,String walletId, String providerName){
        super(transactionId, amount);
        this.walletId=walletId;
        this.providerName=providerName;
    }

    @Override
    public void Pay(double amount) {
        System.out.println("Chuyen: " + amount  + " cua " + providerName + " toi walletId " + walletId);
    }

    @Override
    public String GetPaymentDetails() {
        return "CreditCard: " + walletId + " , Name: " + providerName + " Id: " + walletId;

    }

    @Override
    public void ProcessPayment() {
        System.out.println("EWallet process transaction: " + getTransactionId());
        this.Pay(getAmount());
    }
   
}
