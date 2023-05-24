package homebudget;

public class Transaction {
    private String date;
    private String category;
    private String transactionType;
    private int amount;

    public Transaction(String date, String category, int amount, String transactionType) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String getType() {
        return transactionType;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return String.format("%s | %s: %s, %d원", transactionType, date, category, amount);
    }
}
