package Testoop1;

    
import java.time.LocalDateTime;

public abstract class Payment {
    private String transactionId;
    private LocalDateTime date;
    private double amount;
    
    public Payment(String transactionId, double amount){
        this.transactionId=transactionId;
        this.amount=amount;
        this.date = LocalDateTime.now();
    }
    public abstract void ProcessPayment();

    public String getTransactionId() {
        return transactionId;
    }
    public double getAmount() {
        return amount;
    }
    public LocalDateTime getDate() {
        return date;
    }
    
}

