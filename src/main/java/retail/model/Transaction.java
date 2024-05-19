package retail.model;

import java.util.Date;

public class Transaction {
    private String transactionId;
    private String customerId;
    private Date date;
    // Mungkin tambahkan daftar produk dan jumlah yang terjual

    public Transaction(String transactionId, String customerId, Date date) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.date = date;
    }

    // Getter and setter methods
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", date=" + date +
                '}';
    }
}
