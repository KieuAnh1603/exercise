package Testoop1;

public class BankTransfer extends Payment implements IPaymentMethod{
    private String accountNumber;
    private String bankCode;

    public BankTransfer(String transactionId, double amount, String accountNumber, String bankCode){
        super(transactionId, amount);
        this.accountNumber=accountNumber;
        this.bankCode=bankCode;
    }

    @Override
    public void Pay(double amount) {
        System.out.println("Chuyen " + amount + " toi " + accountNumber);
    }

    @Override
    public String GetPaymentDetails() {
        return "BankTransfer: " + accountNumber + ", BankCode: "+bankCode;
    }

    @Override
    public void ProcessPayment() {
        
        System.out.println("BankTransfer processing transaction: "+ this.getTransactionId());
        this.Pay(getAmount());
    }
}
