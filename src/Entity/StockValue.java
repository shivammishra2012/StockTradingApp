package Entity;

import Entity.Currency;

public class StockValue {


    public StockValue(int versionNumber, Currency currency, double amount) {
        this.versionNumber = versionNumber;
        this.currency = currency;
        this.amount = amount;
    }

    private final int versionNumber;

    public Currency getCurrency() {
        return currency;
    }

    private final Currency currency;

    public double getAmount() {
        return amount;
    }

    private final double amount;

    public int getVersionNumber() {
        return versionNumber;
    }
}
