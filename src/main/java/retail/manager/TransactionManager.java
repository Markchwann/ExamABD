package retail.manager;

import retail.model.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactionList;

    public TransactionManager() {
        this.transactionList = new ArrayList<>();
    }

    // Method untuk menambah transaksi ke daftar transaksi
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    // Method untuk menghapus transaksi dari daftar transaksi
    public void removeTransaction(Transaction transaction) {
        transactionList.remove(transaction);
    }

    // Method untuk mendapatkan semua transaksi dari daftar transaksi
    public List<Transaction> getAllTransactions() {
        return transactionList;
    }

    // Method untuk mencari transaksi berdasarkan ID transaksi
    public Transaction findTransactionById(String transactionId) {
        for (Transaction transaction : transactionList) {
            if (transaction.getTransactionId().equals(transactionId)) {
                return transaction;
            }
        }
        return null;
    }

    // Method untuk mencari transaksi berdasarkan ID pelanggan
    public List<Transaction> findTransactionByCustomerId(String customerId) {
        List<Transaction> foundTransactions = new ArrayList<>();
        for (Transaction transaction : transactionList) {
            if (transaction.getCustomerId().equals(customerId)) {
                foundTransactions.add(transaction);
            }
        }
        return foundTransactions;
    }

    // Method untuk mencari transaksi berdasarkan tanggal
    public List<Transaction> findTransactionByDate(Date date) {
        List<Transaction> foundTransactions = new ArrayList<>();
        for (Transaction transaction : transactionList) {
            if (transaction.getDate().equals(date)) {
                foundTransactions.add(transaction);
            }
        }
        return foundTransactions;
    }
}
