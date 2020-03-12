package oop.taxes;

public class TaxPayer implements TaxStrategy{
    public TaxPayer(TaxStrategy strategy) {
    }

    public double getIncome(){
        return 0;
    }

    @Override
    public void extortCash(TaxPayer p) {
    }
}
