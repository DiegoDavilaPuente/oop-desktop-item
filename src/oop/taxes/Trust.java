package oop.taxes;

public class Trust extends TaxPayer {
    public Trust(TaxStrategy strategy) {
        super(strategy);
    }

    public boolean isNonProfit() {
        return false;
    }
}
