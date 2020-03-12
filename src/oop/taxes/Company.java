package oop.taxes;

public class Company extends TaxPayer {
    public Company(TaxStrategy strategy) {
        super(strategy);
    }

    public int getNumberOfEmployees() {
        return 0;
    }
}
