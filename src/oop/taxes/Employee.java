package oop.taxes;

public class Employee extends TaxPayer{
    private String gender;
    public Employee(TaxStrategy strategy, String gender) {
        super(strategy);
        this.gender = gender;
    }

    public boolean isMarried() {
        return false;
    }

    public String getGender() {
        return(gender);
    }
}
